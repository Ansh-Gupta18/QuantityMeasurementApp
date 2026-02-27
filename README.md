### UC12: Subtraction and Division Operations on Quantity Measurements


Extended the generic Quantity<U extends IMeasurable> architecture to support Subtraction and Division across all measurement categories (Length, Weight, Volume).


-- Covered:

- Implemented overloaded subtract() methods
- Implicit target unit (first operand’s unit)
- Explicit target unit specification
- Implemented divide() method returning a dimensionless scalar (double)
- Enabled cross-unit arithmetic (e.g., feet − inches, kg − grams, litre − mL)
- Normalized operands through base unit before arithmetic
- Added strict validation (null checks, finiteness, cross-category prevention)
- Prevented division by zero (throws ArithmeticException)
- Preserved immutability (operations return new objects)
- Maintained rounding consistency (2 decimal places for Quantity results)
- Verified non-commutativity of subtraction and division
- Ensured compatibility with addition, equality, and conversion

-- Outcome:

- Quantity system now supports full arithmetic set: add, subtract, divide
- Generic design required no structural refactoring
- Architecture scales seamlessly across Length, Weight, and Volume
- SOLID principles maintained (SRP, OCP, DRY intact)
- Cross-category operations safely rejected at compile-time + runtime
- Demonstrated mathematical correctness (identity, inverse, non-commutativity)
- Confirmed immutability and functional-style operations
- Strengthened validation and fail-fast error handling

--  SOLID / Design Validation:

-  SRP maintained (Quantity handles arithmetic only)
-  OCP maintained (new operations added without modifying enums)
-  DRY preserved (shared base-unit normalization logic reused)
-  Minor Improvement Area: If arithmetic logic grows further, extract shared private helper for base-unit arithmetic to avoid future duplication.

- 🔗 Code Link: [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC12-Subtraction-and-Division-Operations-on-Quantity-Measurements/src)
