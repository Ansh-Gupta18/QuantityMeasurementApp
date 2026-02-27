### UC10: Generic Quantity Class with Unit Interface (Multi-Category Support)

Refactored the architecture to introduce a single generic Quantity<U extends IMeasurable> class, eliminating duplication across category-specific classes and enabling scalable multi-category measurement support.


-- Covered:

- Created IMeasurable interface defining unit conversion contract
- Refactored LengthUnit and WeightUnit to implement IMeasurable
- Replaced QuantityLength and QuantityWeight with generic Quantity<U>
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

- 🔗 Code Link: UC10: [Generic Quantity Class with Unit Interface (Multi-Category Support)](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC10-MultiCategoryUnit/src)
