# Temperature Converter API

A RESTful Temperature Converter API developed using Spring Boot, MongoDB, and Docker Compose for the IT41073 – Service Oriented Computing module.

This application converts temperatures between Celsius and Fahrenheit, stores conversion history in MongoDB, provides temperature warning messages, filters conversion records by unit, and allows users to delete stored history. The application is deployed using Docker Compose.

## Project Information

Project Title: Temperature Converter API

Module: IT41073 – Service Oriented Computing

Student Name: M. Imashi Shashikala

Student ID: ITBIN-2313-0135

## Technologies Used

* Java 21
* Spring Boot
* Spring Data MongoDB
* MongoDB 8.0
* Maven
* Docker
* Docker Compose
* REST API
* Postman
* Git
* GitHub

## Features

* Convert temperatures between Celsius and Fahrenheit
* Store temperature conversion history in MongoDB
* View all conversion history
* Filter history by temperature unit
* Check temperature warning conditions
* Delete conversion history
* API Key validation
* Docker Compose deployment

## Project Structure

```text
tempconverter
|
|-- src
|-- Dockerfile
|-- docker-compose.yml
|-- pom.xml
|-- README.md
|-- mvnw
|-- mvnw.cmd
```

## REST API Endpoints

Base URL:

```text
http://localhost:8081/api/temperatures
```

Convert Temperature

Method: POST

Endpoint:

```text
/convert?value=100&unit=C
```

Header:

```text
API-Key: SUPER-SECRET-DEV-KEY-123
```

View History

Method: GET

Endpoint:

```text
/history
```

Filter History

Method: GET

Endpoint:

```text
/history/filter?unit=C
```

Warning Check

Method: GET

Endpoint:

```text
/warning-check?value
```
## Author

Name: M. Imashi Shashikala

