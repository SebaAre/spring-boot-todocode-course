# Spring Boot TodoCode Course

Exercise of the TodoCode Academy Spring Boot course by Luisina de Paula.

Academy Website: https://todocodeacademy.com/


# Exercise 01 - Programming Student API

Simple API to track courses and topics for a programming student's CV.

## What it does

Manage courses and their topics. One course = many topics.

## Database

**Course:** id, name, modality, completionDate, topics list

**Topic:** id, name, description

## Endpoints

### Courses

- `POST /courses/create` - Create course
- `GET /courses/get` - Get all courses
- `GET /courses/topic/{idCourse}` - Get topics from a course
- `GET /courses/java` - Get courses containing "Java"
- `PUT /courses/edit` - Update course

### Topics

- `POST /topic/create` - Create topic and assign to course
- `PUT /topic/edit` - Update topic

## Setup

Create MySQL database: `courses`

Edit `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/courses
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


## Tech Used
Java 17, Spring Boot, JPA, MySQL, Lombok
