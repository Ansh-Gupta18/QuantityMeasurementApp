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
