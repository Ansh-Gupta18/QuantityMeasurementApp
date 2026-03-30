## 🚀 UC17: Spring Boot REST API Integration

📅 Date: 24-Mar-2026  

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
