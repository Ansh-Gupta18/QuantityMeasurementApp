### Quantity Measurement App - UC13 (CentralizedArithmetic )

UC13 refactors the arithmetic operations introduced in UC12 by centralising all shared validation, unit conversion, and base-unit arithmetic logic into private helper methods.
This refactoring enforces the DRY (Don’t Repeat Yourself) principle, reduces code duplication, and improves maintainability, while keeping all public APIs and behaviours unchanged.


- Use Case: UC13 Centralised Arithmetic Logic 
Eliminate repeated logic across the add, subtract, and divide methods
Ensure consistent validation and error handling for all arithmetic operations
Improve readability and maintainability of arithmetic logic
Provide a scalable foundation for future operations (multiply, modulo, etc.)
Preserve all UC12 behaviour and existing test cases


-  Key Implementation Points (Brief)
Centralised validation logic in one private helper method.
Single helper for base-unit conversion and arithmetic.
ArithmeticOperation enum (ADD, SUBTRACT, DIVIDE) encapsulates operation logic.
add, subtract, divide delegate to shared helpers.
Implicit and explicit target unit behaviour preserved.
Public APIs unchanged; UC12 tests pass as-is.
DRY enforced, cleaner code, easier future extension.

- Code link : [UC13 CentralizedArithmetic](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC13-CentralizedUnit/src)
