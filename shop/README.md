# Spring Boot TodoCode Course

Exercise of the TodoCode Academy Spring Boot course by Luisina de Paula.

**Academy Website:** https://todocodeacademy.com/

---

## Final Project - Shop API

Complete REST API to manage sales, products, and clients for a shop.

---

## What it does

Manage clients, products, and sales with relationships. One sale = many products + one client.

---

## Database

**Client:** clientId, firstName, lastName, dni

**Product:** productCode, name, brand, cost, stock

**Sale:** saleId, saleDate, total, products (ManyToMany), client (ManyToOne)

---

## Endpoints

### Clients
* `POST /clients/create` - Create client
* `GET /clients` - Get all clients
* `GET /clients/{id}` - Get client by ID
* `PUT /clients/edit/{id}` - Update client
* `DELETE /clients/delete/{id}` - Delete client

### Products
* `POST /products/create` - Create product
* `GET /products` - Get all products
* `GET /products/{code}` - Get product by code
* `PUT /products/edit/{code}` - Update product
* `DELETE /products/delete/{code}` - Delete product
* `GET /products/low_stock` - Get products with stock < 5

### Sales
* `POST /sales/create` - Create sale
* `GET /sales` - Get all sales
* `GET /sales/{id}` - Get sale by ID
* `PUT /sales/edit/{id}` - Update sale
* `DELETE /sales/delete/{id}` - Delete sale
* `GET /sales/products/{id}` - Get products from a specific sale
* `GET /sales/date/{date}` - Get sales summary by date
* `GET /sales/highest_sale` - Get highest sale (returns DTO)

---

## Setup

1. Create MySQL database: `shop`

2. Edit `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shop
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application

---

## Tech Used

Java 17, Spring Boot, JPA, MySQL, Lombok

---

## Features

- Complete CRUD operations
- ManyToMany relationship (Sale-Product)
- ManyToOne relationship (Sale-Client)
- Custom filtering with manual loops
- DTO for custom responses
- 19 REST endpoints