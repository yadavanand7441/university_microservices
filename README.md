
UNIVERSITY MANAGEMENT SYSTEM - COMPLETE MICROSERVICES PROJECT

Tech:
- Spring Boot 3
- Spring Cloud (Eureka, Gateway, Feign)
- PostgreSQL
- Docker & Docker Compose

Run:
1) mvn clean package (root)
2) docker-compose up --build

Access:
- Eureka: http://localhost:8761
- Gateway: http://localhost:8080

APIs:
POST /college
POST /professor
POST /student
