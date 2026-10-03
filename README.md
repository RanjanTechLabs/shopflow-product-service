# product-service

Spring Boot microservice for ShopFlow.

Port: 8082
Database: shopflow_product
Kafka topic produced: product-created

CRUD:
GET    /api/products
GET    /api/products/{id}
POST   /api/products
PUT    /api/products/{id}
DELETE /api/products/{id}

Run:

```bash
mvn spring-boot:run
```

Infrastructure is intentionally external in this learning phase:
- PostgreSQL: localhost:5432
- Kafka: localhost:9092

No Spring Security, Auth Service, Docker, Redis or CI/CD is included.
