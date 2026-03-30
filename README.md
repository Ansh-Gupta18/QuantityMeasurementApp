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
