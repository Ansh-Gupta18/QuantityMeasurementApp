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
