# Spring Boot TodoCode Course

Exercise of the TodoCode Academy Spring Boot course by Luisina de Paula.

Academy Website: https://todocodeacademy.com/


# Exercise 02 - Veterinary Clinic API

Simple API to manage pets and their owners at a veterinary clinic.

## What it does

Manage pets and owners. One pet = one owner.

## Database

**Pet:** id, name, species, breed, color, owner(foreign key to Owner)

**Owner:** id, dni, firstName, lastName, phone

## Endpoints

### Pets
* `POST /pet/create` - Create pet
* `GET /pet/get` - Get all pets
* `PUT /pet/edit` - Update pet
* `DELETE /pet/delete/{id}` - Delete pet
* `GET /pet/get_poodles` - Get all poodles
* `GET /pet/get_owner` - Get pets with owner details (returns DTO)

### Owners
* `POST /owner/create` - Create owner
* `GET /owner/get` - Get all owners
* `PUT /owner/edit` - Update owner
* `DELETE /owner/delete/{id}` - Delete owner

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
