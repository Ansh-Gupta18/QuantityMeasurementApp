
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

