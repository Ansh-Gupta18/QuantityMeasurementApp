### UC11: Volume Measurement Equality, Conversion, and Addition (Litre, Millilitre, Gallon)


Extended the generic Quantity<U extends IMeasurable> architecture to support a third measurement category: Volume, without modifying any existing core classes.


-- Covered:

- Created standalone VolumeUnit enum (LITRE, MILLILITRE, GALLON) implementing IMeasurable
- Defined base unit normalization using LITRE as the base unit
- Implemented accurate conversion factors (1 L = 1000 mL, 1 gal ≈ 3.78541 L)
- Verified equality comparison across units (L ↔ mL ↔ gallon)
- Validated conversion operations using generic convertTo() method
- Tested addition (implicit and explicit target unit) using generic add() methods
- Ensured cross-category safety (Volume ≠ Length ≠ Weight)
- Preserved immutability and epsilon-based floating-point tolerance
- Confirmed zero changes required in Quantity<U>, IMeasurable, or app structure

-- Outcome:

- Proved UC10 generic design scales seamlessly to new categories
- Demonstrated true DRY compliance across three independent domains
- Validated architectural scalability without exponential code growth
- Maintained strict type safety using generics and runtime unit checks
- Ensured mathematical accuracy across all volume operations
- Established repeatable pattern for adding future categories (Temperature, Time, etc.)

- 🔗 Code Link: UC11: [Volume Measurement Equality](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC11-VolumeMeasurement/src)
