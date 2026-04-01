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

  ---

 ### UC13:  Quantity Measurement App(CentralizedArithmetic )
UC13 refactors the arithmetic operations introduced in UC12 by centralising all shared validation, unit conversion, and base-unit arithmetic logic into private helper methods. This refactoring enforces the DRY (Don’t Repeat Yourself) principle, reduces code duplication, and improves maintainability, while keeping all public APIs and behaviours unchanged.

- Use Case: UC13 Centralised Arithmetic Logic Eliminate repeated logic across the add, subtract, and divide methods Ensure consistent validation and error handling for all arithmetic operations Improve readability and maintainability of arithmetic logic Provide a scalable foundation for future operations (multiply, modulo, etc.) Preserve all UC12 behaviour and existing test cases

- Key Implementation Points (Brief) Centralised validation logic in one private helper method. Single helper for base-unit conversion and arithmetic. ArithmeticOperation enum (ADD, SUBTRACT, DIVIDE) encapsulates operation logic. add, subtract, divide delegate to shared helpers. Implicit and explicit target unit behaviour preserved. Public APIs unchanged; UC12 tests pass as-is. DRY enforced, cleaner code, easier future extension.

- Code link : [UC13 CentralizedArithmetic](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC13-CentralizedUnit/src)


---


###   UC14:  Quantity Measurement App  (Temperature Measurement with Selective Arithmetic Support)
- UC14 extends the Quantity Measurement Application to support temperature measurements while respecting real-world arithmetic constraints. Unlike length, weight, and volume, temperature does not support full arithmetic. This use case refactors the IMeasurable interface to make arithmetic optional, enabling temperature units to support only equality and conversion while rejecting unsupported operations with clear errors.

- Use Case: UC14 (Temperature Measurement) Introduces temperature measurement support with unit conversion and equality Restricts unsupported arithmetic operations on temperature with clear validation Refactors IMeasurable to allow selective operation support while keeping existing units unchanged

 UC14 – Key Implementation Points Introduced TemperatureUnit (Celsius, Fahrenheit, Kelvin) with non-linear conversion formulas.

Refactored IMeasurable to add default methods for optional arithmetic support.

Added SupportsArithmetic functional interface with lambda-based capability flags.

Non-temperature units inherit default arithmetic support (backwards compatible).

Temperature explicitly disables arithmetic (add, subtract, divide) via overrides.

Quantity validates operation support upfront before performing arithmetic.

Equality and conversion work uniformly via base-unit normalisation.

Cross-category comparisons remain prohibited and type-safe.

Unsupported operations fail fast with clear UnsupportedOperationException messages.

All UC1–UC13 tests pass unchanged, ensuring non-breaking evolution.

- Code Link: [UC14 (Temperature Measurement with Selective Arithmetic Support)](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC14-TemperatureMeasurement/src)


  ---

  ### UC15: N-Tier Architecture Refactoring  
  

Refactored the **Quantity Measurement Application** from a monolithic design into a **clean N-Tier architecture** to improve scalability, maintainability, and testability.

---

### 🔧 Layers Introduced

**Application Layer**
- `QuantityMeasurementApp`
- Entry point that initializes controller and service.

**Controller Layer**
- `QuantityMeasurementController`
- Handles requests and delegates operations to the service.

**Service Layer**
- `QuantityMeasurementServiceImpl`
- Contains core business logic for comparison, conversion, and arithmetic.

**Repository Layer**
- `IQuantityMeasurementRepository`
- `QuantityMeasurementCacheRepository` (Singleton) for storing operation history.

**Entity / Model Layer**
- `QuantityDTO` – data transfer between layers  
- `QuantityModel` – internal service representation  
- `QuantityMeasurementEntity` – stores operation details and results  

---

### 🎯 Outcome
- Clear **separation of concerns**
- Business logic reusable across **CLI, REST API, or GUI**
- Improved **testability and maintainability**
- Ready for **Dependency Injection and framework integration**
- All **UC1–UC14 functionality preserved**

---

### 🧠 Design Patterns Used
- **Singleton** – Repository  
- **Factory** – Service & controller creation  
- **Facade** – Controller simplifies service calls  
- **Dependency Injection** – Loose coupling between layers  

---

🔗 Code Link:  
[Source Code - ](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC15-NTierArchitectureRefactor/src)


---

### UC16: JDBC Database Integration & Persistence  
  

Enhanced the **Quantity Measurement Application** by integrating **JDBC-based database persistence** into the existing N-Tier architecture, replacing in-memory storage with a scalable and secure relational database solution.

---

### 🔧 Enhancements Introduced  

**Database Integration**
- Implemented `QuantityMeasurementDatabaseRepository` using JDBC  
- Supports CRUD operations with relational database  
- Enables persistent storage of measurement history  

**Configuration Layer**
- `ApplicationConfig` for loading database properties  
- `application.properties` for environment-based configuration  

**Connection Management**
- `ConnectionPool` for efficient database connection reuse  
- Handles max pool size, idle connections, and performance  

**Exception Handling**
- Introduced `DatabaseException` for DB-specific errors  
- Improved error propagation across layers  

**Repository Flexibility**
- Supports both:
  - `QuantityMeasurementCacheRepository` (in-memory)
  - `QuantityMeasurementDatabaseRepository` (database)
- Switching via configuration (Dependency Injection)

**Logging**
- Integrated **SLF4J + Logback**
- Replaced `System.out.println` with structured logging  

**Maven Integration**
- Standard project structure (`src/main`, `src/test`)  
- Added dependencies:
  - H2 Database  
  - MySQL/PostgreSQL (future use)  
  - JUnit & Mockito  
  - SLF4J  

---

### 🎯 Outcome  

- Persistent storage of measurement data  
- Support for **querying, filtering, and reporting**  
- Improved **scalability and performance**  
- Secure database operations using **PreparedStatement**  
- Efficient resource usage via **connection pooling**  
- Fully **backward compatible with UC15**  
- Ready for **enterprise-level backend (Spring Boot)**  

---

### 🧠 Design Patterns & Concepts Used  

- **Repository Pattern** – Abstracts database operations  
- **Dependency Injection** – Switch between cache and DB  
- **Factory Pattern** – Repository creation  
- **Singleton** – Connection pool management  
- **DAO Pattern (JDBC)** – Structured DB interaction  
- **Connection Pooling** – Performance optimization  

---

### 🗄️ Database Features  

- H2 in-memory database (development/testing)  
- Schema initialization using `schema.sql`  
- Parameterized queries (SQL Injection safe)  
- Transaction management for consistency  
- Query support:
  - Get all measurements  
  - Filter by operation/type  
  - Count records  
  - Delete all records  

---

### 🧪 Testing  

- Unit tests for:
  - Repository  
  - Service  
  - Controller  
- Integration tests with H2 database  
- Connection pool testing  
- SQL injection prevention testing  

---

### 🚀 Commands  

mvn clean compile      # Build project  
mvn exec:java          # Run application  
mvn clean test         # Execute tests  

---

### 🔄 Improvements Over UC15  

- In-memory → Database persistence  
- No query support → SQL-based querying  
- No concurrency → Connection pooling  
- No schema → Structured relational schema  
- Limited scalability → Enterprise-ready system  

---

### 🔗 Code Link  
[Source Code - UC16](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC16-DatabaseIntegrationWithJDBC/src)

---

## 🚀 UC17: Spring Boot REST API Integration  

Upgraded the **Quantity Measurement Application** to a **Spring Boot REST API**, replacing JDBC with **Spring Data JPA** for a scalable, enterprise-ready backend.

---

## 🔧 Key Enhancements

- **Spring Boot** – Auto-config + embedded server  
- **REST APIs** – `@RestController`, JSON support  
- **Spring Data JPA** – Replaced JDBC, auto CRUD & queries  
- **Service Layer** – `@Service` with DI  
- **DTO + Validation** – Clean API contracts  
- **Global Exception Handling** – `@ControllerAdvice`  
- **Swagger** – API documentation  
- **Actuator** – Health & metrics  

---

## 🎯 Outcome

- Scalable RESTful backend  
- Reduced boilerplate code  
- Improved maintainability  
- Production-ready architecture  

---

## 🧪 Testing

- `@WebMvcTest` (Controller)  
- `@SpringBootTest` (Integration)  
- Mockito for mocking  

---

## 🚀 Commands

```bash
mvn spring-boot:run
mvn clean test
```
### 🔗 Code Link

[Source Code - UC17](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC17-SpringFrameworkIntegration/src)

---




### UC18: Google Authentication and User Management for Quantity Measurement  


Implemented secure user authentication and management in the Quantity Measurement Spring Boot application using **Spring Security with JWT and OAuth2 (Google Login)**.

---


<br>

##  🔧 Covered:

- Designed `User` entity with fields like username, email, password, and role  
- Implemented `UserController` for user registration and login using JWT  
- Created `GoogleAuthController` to handle Google OAuth2 login flow  
- Configured Spring Security using `SecurityConfig` for both JWT and OAuth2 authentication  
- Integrated Google OAuth2 login using `spring.security.oauth2.client.registration.google`  
- Generated JWT tokens using `JwtService` after successful authentication  
- Implemented `JwtFilter` to validate JWT in every request  
- Developed `CustomUserDetailsService` for loading user details from database  
- Created DTOs (`RegisterRequest`, `LoginRequest`, `AuthResponse`) for structured data handling  
- Applied password encryption using `BCryptPasswordEncoder`  
- Handled unauthorized access using `JwtAuthenticationEntryPoint` and custom exceptions  
- Maintained stateless session using JWT with Spring Security filters  
- Tested authentication flows using Swagger and Postman  

---

<br>

##  🎯Outcome:

- Successfully integrated **JWT-based authentication** with **Google OAuth2 login**  
- Achieved secure and scalable user management system  
- Gained deep understanding of Spring Security filter chain and authentication mechanisms  
- Enabled both traditional login and third-party login (Google) in a single application  
- Built a production-ready authentication system for REST APIs  

---

<br>🔗 Code Link:  [source-code](https://github.com/Ansh-Gupta18/QuantityMeasurementApp/tree/feature/UC18-Google-Authnetication-and-User-Management-for-Quantity-Measurement)

