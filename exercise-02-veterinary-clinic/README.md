# Exercise 02 - Veterinary Clinic API

Simple API to manage pets and their owners at a veterinary clinic.

## What it does

Manage pets and owners. One pet = one owner.

## Database

**Pet:** id, name, species, breed, color, owner

**Owner:** id, dni, firstName, lastName, phone

## Endpoints

### Pets
* `POST /pets/create` - Create pet
* `GET /pets/get` - Get all pets
* `GET /pets/{id}` - Get pet by ID
* `PUT /pets/edit` - Update pet
* `DELETE /pets/delete/{id}` - Delete pet
* `GET /pets/filter?species=perro&breed=caniche` - Filter by species and breed
* `GET /pets/{id}/with-owner` - Get pet with owner details

### Owners
* `POST /owners/create` - Create owner
* `GET /owners/get` - Get all owners
* `GET /owners/{id}` - Get owner by ID
* `PUT /owners/edit` - Update owner
* `DELETE /owners/delete/{id}` - Delete owner

## Setup

Create MySQL database: `veterinary_clinic`

Edit `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/veterinary_clinic
spring.datasource.username=yourusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


## Tech Used
Java 17, Spring Boot, JPA, MySQL, Lombok