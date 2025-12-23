# Product CRUD Application

Spring Boot REST API tətbiqi - Məhsul (Product) üçün CRUD əməliyyatları.

## Xüsusiyyətlər

- Java 17
- Spring Boot 3.2.0
- Spring Data JPA
- H2 Database (In-Memory)
- REST API
- Lombok

## Tətbiqin işə salınması

### Eclipse ilə:

1. Eclipse-i açın
2. File -> Import -> Maven -> Existing Maven Projects
3. Bu qovluğu seçin
4. Proyekti seçin və Finish düyməsini basın
5. `ProductCrudApplication.java` faylını açın
6. Sağ klik -> Run As -> Java Application

### Maven ilə:

```bash
mvn spring-boot:run
```

### Kompilyasiya:

```bash
mvn clean install
```

## API Endpoints

### 1. Yeni məhsul əlavə et (CREATE)
```
POST http://localhost:8080/api/products
Content-Type: application/json

{
    "name": "Laptop",
    "description": "Dell XPS 15",
    "price": 1500.00,
    "quantity": 10,
    "category": "Electronics"
}
```

### 2. Bütün məhsulları göstər (READ ALL)
```
GET http://localhost:8080/api/products
```

### 3. ID-yə görə məhsul göstər (READ ONE)
```
GET http://localhost:8080/api/products/1
```

### 4. Kateqoriyaya görə məhsulları göstər
```
GET http://localhost:8080/api/products/category/Electronics
```

### 5. Ada görə məhsul axtar
```
GET http://localhost:8080/api/products/search?name=Laptop
```

### 6. Məhsulu yenilə (UPDATE)
```
PUT http://localhost:8080/api/products/1
Content-Type: application/json

{
    "name": "Laptop Updated",
    "description": "Dell XPS 15 2024",
    "price": 1600.00,
    "quantity": 8,
    "category": "Electronics"
}
```

### 7. Məhsulu sil (DELETE)
```
DELETE http://localhost:8080/api/products/1
```

### 8. Bütün məhsulları sil
```
DELETE http://localhost:8080/api/products
```

## H2 Database Console

URL: http://localhost:8080/h2-console

- JDBC URL: `jdbc:h2:mem:productdb`
- Username: `sa`
- Password: (boş buraxın)

## Proyekt Strukturu

```
src/
├── main/
│   ├── java/
│   │   └── com/pragmatech/productcrud/
│   │       ├── ProductCrudApplication.java
│   │       ├── controller/
│   │       │   └── ProductController.java
│   │       ├── model/
│   │       │   └── Product.java
│   │       ├── repository/
│   │       │   └── ProductRepository.java
│   │       └── service/
│   │           └── ProductService.java
│   └── resources/
│       └── application.properties
└── test/
```
