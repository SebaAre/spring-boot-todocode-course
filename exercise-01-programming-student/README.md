# Exercise 01 - Programming Student API

Simple API to track courses and topics for a programming student's CV.

## What it does

Manage courses and their topics. One course = many topics.

## Database

Course id, name, modality, completionDate, topics list

Topic id, name, description

## API Endpoints

Courses
- POST `apicourses` - Create
- GET `apicourses` - Get all
- GET `apicourses{id}` - Get one
- GET `apicourses{id}topics` - Get course topics
- GET `apicoursessearchname=Java` - Search by name
- PUT `apicourses{id}` - Update
- DELETE `apicourses{id}` - Delete

Topics
- POST `apitopics` - Create
- GET `apitopics` - Get all
- GET `apitopics{id}` - Get one
- PUT `apitopics{id}` - Update
- DELETE `apitopics{id}` - Delete


## Tech

Java 17, Spring Boot, JPA, MySQL

[← Back](..README.md)