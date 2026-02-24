### UC4 – Extended Unit Support (Yards & Centimeters)
- Branch: feature/UC4-YardEquality

 Objective

- Extend QuantityLength class to support Yards and Centimeters
- Maintain cross-unit equality comparisons
- Preserve all previous UC1–UC3 functionality
- Ensure DRY principle while adding new units
 Implementation

- Added YARDS and CENTIMETERS to LengthUnit enum with proper conversion factors
- Verified QuantityLength equals() method works seamlessly for new units
- Ensured type safety, numeric validation, and null handling
- Covered yard-to-yard, yard-to-feet, yard-to-inches, and cm conversions in JUnit 5 tests
- All previous tests from UC1–UC3 continue to pass
- Code link : [Source Code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC4-YardEquality/src)
