### UC1 – Feet Equality Verification
- Branch: feature/UC1-FeetEquality

 Objective

- Check if two measurements in Feet are equal
- Correctly override equals() for comparison
- Apply Test-Driven Development principles
 Implementation

- Defined Feet class for encapsulating measurement
- Added precise equality logic using Double.compare()
- Ensured null safety and type validation
- Created comprehensive JUnit 5 tests

- Code link : [source code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC1-FeetEquality/src)

  ---

###  UC2 – Feet and Inches Equality Verification
- Branch: feature/UC2-InchEquality

Objective

- Extend UC1 to check equality of measurements in Inches along with Feet
- Ensure proper equals() logic for both units
- Maintain Test-Driven Development approach
Implementation

- Defined Inches class alongside Feet class
- Added equality logic for Inches using Double.compare()
- Validated numeric input for both units
- Ensured null safety and type validation
- Reduced main method dependency by creating dedicated methods for Feet and Inches equality
- Created JUnit 5 test cases covering same and different values, nulls, and self-reference
 
- Code link : [Source code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC2-InchEquality/src)


---

### UC3 – Generic Quantity Class for DRY Principle
- Branch: feature/UC3-GenericLength
Objective

- Refactor Feet and Inches classes into a single QuantityLength class

- Apply DRY principle to remove code duplication

- Maintain all equality and conversion functionality from UC1 & UC2

- Enable easy extension for new units Implementation

- Introduced LengthUnit enum for all supported units and conversion factors

- Created QuantityLength class handling value + unit

- Centralized equality logic using base unit conversion

- Ensured type safety, null handling, and numeric validation

- Added comprehensive JUnit 5 tests for same-unit, cross-unit, and invalid inputs

- All previous UC1 & UC2 functionality preserved

- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC3-GenericLength/src)
