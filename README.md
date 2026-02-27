### UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility


Refactored LengthUnit from a nested enum inside QuantityLength to a standalone top-level enum and delegated all conversion responsibilities to it, improving scalability and adhering to SOLID principles.


-- Covered:

- Extracted LengthUnit as a standalone enum class (FEET, INCHES, YARDS, CENTIMETERS)
- Implemented convertToBaseUnit() and convertFromBaseUnit() inside LengthUnit
- Removed internal conversion logic from QuantityLength
- Delegated all conversion, equality, and arithmetic operations to unit methods
- Eliminated circular dependency risk for future measurement categories
- Preserved all UC1–UC7 functionality without modifying client code
- Ensured strict validation for null units and invalid values
- Verified backward compatibility by running all previous test cases

-- Outcome:

- Achieved Single Responsibility Principle (SRP) compliance
- Improved separation of concerns and reduced coupling
- Centralized conversion logic for better cohesion
- Established scalable architecture for future categories (WeightUnit, VolumeUnit, etc.)
- Maintained immutability, type safety, and mathematical correctness
- Successfully refactored without breaking existing APIs or test suites

- 🔗 Code Link: UC8: [Refactoring Unit Enum to Standalone with Conversion Responsibility](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC8-StandaloneUnit/src)
