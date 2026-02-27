### UC1 – Feet Equality Verification
- Branch: feature/UC1-FeetEquality

--  Objective

- Check if two measurements in Feet are equal
- Correctly override equals() for comparison
- Apply Test-Driven Development principles

 -- Implementation

- Defined Feet class for encapsulating measurement
- Added precise equality logic using Double.compare()
- Ensured null safety and type validation
- Created comprehensive JUnit 5 tests

- Code link : [source code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC1-FeetEquality/src)

  ---

###  UC2 – Feet and Inches Equality Verification
- Branch: feature/UC2-InchEquality

-- Objective

- Extend UC1 to check equality of measurements in Inches along with Feet
- Ensure proper equals() logic for both units
- Maintain Test-Driven Development approach

-- Implementation

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
  
-- Objective

- Refactor Feet and Inches classes into a single QuantityLength class

- Apply DRY principle to remove code duplication

- Maintain all equality and conversion functionality from UC1 & UC2

- Enable easy extension for new units

--  Implementation

- Introduced LengthUnit enum for all supported units and conversion factors

- Created QuantityLength class handling value + unit

- Centralized equality logic using base unit conversion

- Ensured type safety, null handling, and numeric validation

- Added comprehensive JUnit 5 tests for same-unit, cross-unit, and invalid inputs

- All previous UC1 & UC2 functionality preserved

- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC3-GenericLength/src)



---

### UC4 – Extended Unit Support (Yards & Centimeters)
- Branch: feature/UC4-YardEquality
  
-- Objective

- Extend QuantityLength class to support Yards and Centimeters

- Maintain cross-unit equality comparisons

- Preserve all previous UC1–UC3 functionality

- Ensure DRY principle while adding new units

-- Implementation

- Added YARDS and CENTIMETERS to LengthUnit enum with proper conversion factors

- Verified QuantityLength equals() method works seamlessly for new units

- Ensured type safety, numeric validation, and null handling

- Covered yard-to-yard, yard-to-feet, yard-to-inches, and cm conversions in JUnit 5 tests

- All previous tests from UC1–UC3 continue to pass

- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC4-YardEquality/src)

---

### UC5 – Unit-to-Unit Conversion (Same Measurement Type)
- Branch: feature/UC5-UnitConversion

-- Objective

- Provide explicit conversion between units (feet ↔ inches, yards ↔ feet, centimeters ↔ inches, etc.)

- Maintain DRY principle and preserve UC1–UC4 functionality

- Expose a standard convert() API for all supported units

- Ensure bidirectional and precise conversions with proper validation 

-- Implementation

- Added static convert(value, sourceUnit, targetUnit) method in QuantityLength

- Validates numeric value and non-null, supported source/target units

- Normalizes input to base unit (feet) before converting to target unit

- Overloaded demonstrateLengthConversion() for raw values and QuantityLength instances

- Ensured proper rounding, epsilon tolerance, and exception handling for invalid inputs

- Preserved equals() and toString() overrides for consistent object behavior

- Comprehensive JUnit 5 tests cover same-unit, cross-unit, negative, zero, large, and small conversions

- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC5-UnitConversion/src)

---

### UC6 – Addition of Two Length Units (Same Category)
- Branch: feature/UC6-UnitAddition
   
-- Objective

- Enable addition of two QuantityLength objects, potentially with different units
- Result is expressed in the unit of the first operand
- Maintain DRY, immutability, and cross-unit precision

-- Implementation

- Added instance and static add() methods in QuantityLength
- Validates non-null operands, valid LengthUnits, and finite values
- Converts both operands to base unit (feet), performs addition
- Converts sum to the unit of the first operand
- Returns a new QuantityLength object (immutability preserved)
- Leverages UC5 conversion logic; no duplication of conversion code
- Overloaded methods to support raw values or QuantityLength objects
- Handles zero, negative, large, and small values
- Comprehensive JUnit 5 tests cover same-unit, cross-unit, commutativity, and precision
- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/fetaure/UC6-UnitAddition/src)

---

### UC7 – Addition with Target Unit Specification
- Branch: feature/UC7-TargetUnitAddition
  
-- Objective

- Extend UC6 addition functionality by allowing an explicit target unit
- Result can be expressed in any supported LengthUnit, not just the first operand
- Maintain immutability, precision, and cross-unit consistency
 
-- Implementation

 - Overloaded add() methods in QuantityLength to accept an explicit target unit
 - Validates non-null operands, valid LengthUnits, and finite values
 - Converts both operands to a base unit (feet), performs addition
 - Converts the sum to the specified target unit
 - Returns a new QuantityLength object (immutability preserved)
 - Reuses private utility addition method to avoid code duplication
 - Supports both implicit (first operand unit) and explicit target unit addition
 - Handles zero, negative, large, and small values
 - Ensures commutativity: add(A, B, targetUnit) = add(B, A, targetUnit)
 - Comprehensive JUnit 5 tests cover same-unit, cross-unit, and all target unit combinations
- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC7-TargetUnitAddition)

---

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

- 🔗 Code Link: [UC8: Refactoring Unit Enum to Standalone with Conversion Responsibility](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC8-StandaloneUnit/src)


---

### UC9: Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)
Extended the Quantity Measurement Application to support a new measurement category: Weight, implementing equality, conversion, and addition operations for Kilogram, Gram, and Pound units.

-- Covered:

- Created standalone WeightUnit enum (KILOGRAM, GRAM, POUND) with base unit normalization (kilogram)
- Implemented QuantityWeight class mirroring QuantityLength design
- Added equality comparison using base unit (kg) normalization with epsilon tolerance
- Implemented convertTo() method supporting all weight unit pairs
- Added overloaded add() methods (implicit and explicit target unit support)
- Ensured strict category type safety (weight ≠ length)
- Overrode equals(), hashCode(), and toString() for value-object correctness
- Preserved immutability (all operations return new instances)
- Maintained backward compatibility with UC1–UC8
  
-- Outcome:

- Successfully scaled architecture to multiple measurement categories

- Validated reusable design pattern across Length and Weight

- Ensured mathematical correctness in cross-unit weight operations

- Strengthened understanding of enum-based conversion responsibility

- Achieved strong separation of concerns and category isolation

- Confirmed architectural readiness for future categories (Volume, Temperature, etc.)

- 🔗 Code Link: UC9: [Weight Measurement Equality, Conversion, and Addition (Kilogram, Gram, Pound)](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC9-WeightMeasurement/src)


---


### UC10: Generic Quantity Class with Unit Interface (Multi-Category Support)
Refactored the architecture to introduce a single generic Quantity class, eliminating duplication across category-specific classes and enabling scalable multi-category measurement support.

-- Covered:

- Created IMeasurable interface defining unit conversion contract
- Refactored LengthUnit and WeightUnit to implement IMeasurable
- Replaced QuantityLength and QuantityWeight with generic Quantity
- Implemented type-safe equality, conversion, and addition using bounded generics
- Prevented cross-category comparisons using compile-time and runtime checks
- Simplified QuantityMeasurementApp with unified generic demonstration methods
- Preserved all UC1–UC9 functionality without modifying existing tests
- Ensured immutability, hashCode consistency, and DRY compliance
  
-- Outcome:

- Eliminated exponential code duplication across categories

- Achieved full adherence to SRP, DRY, OCP, and LSP principles

- Established scalable architecture for future categories (Volume, Temperature, Time, etc.)

- Reduced maintenance burden with single source of truth for operations

- Strengthened type safety through generics and interface-based design

- Validated performance neutrality with no runtime overhead from generics

- 🔗 Code Link: [UC10: Generic Quantity Class with Unit Interface (Multi-Category Support)](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC10-MultiCategoryUnit/src)


---

### UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)
Extended the generic Quantity architecture to support a third measurement category: Volume, without modifying any existing core classes.

-- Covered:

- Created standalone VolumeUnit enum (LITRE, MILLILITRE, GALLON) implementing IMeasurable
- Defined base unit normalization using LITRE as the base unit
- Implemented accurate conversion factors (1 L = 1000 mL, 1 gal ≈ 3.78541 L)
- Verified equality comparison across units (L ↔ mL ↔ gallon)
- Validated conversion operations using generic convertTo() method
- Tested addition (implicit and explicit target unit) using generic add() methods
- Ensured cross-category safety (Volume ≠ Length ≠ Weight)
- Preserved immutability and epsilon-based floating-point tolerance
- Confirmed zero changes required in Quantity, IMeasurable, or app structure
  
-- Outcome:

- Proved UC10 generic design scales seamlessly to new categories

- Demonstrated true DRY compliance across three independent domains

- Validated architectural scalability without exponential code growth

- Maintained strict type safety using generics and runtime unit checks

- Ensured mathematical accuracy across all volume operations

- Established repeatable pattern for adding future categories (Temperature, Time, etc.)

- 🔗 Code Link: [UC11: Volume Measurement Equality](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC11-VolumeMeasurement/src)

---

### UC12: Subtraction and Division Operations on Quantity Measurements
Extended the generic Quantity architecture to support Subtraction and Division across all measurement categories (Length, Weight, Volume).

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
  
-- SOLID / Design Validation:

- SRP maintained (Quantity handles arithmetic only)

- OCP maintained (new operations added without modifying enums)

- DRY preserved (shared base-unit normalization logic reused)

- Minor Improvement Area: If arithmetic logic grows further, extract shared private helper for base-unit arithmetic to avoid future duplication.

- 🔗 Code Link: [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC12-Subtraction-and-Division-Operations-on-Quantity-Measurements/src)
