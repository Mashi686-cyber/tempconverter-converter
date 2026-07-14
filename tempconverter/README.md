# Temperature Converter API

A temperature conversion REST API built using **Spring Boot**, **MongoDB**, and **Docker Compose**.

## Technologies Used

* Java 21
* Spring Boot
* Spring Data MongoDB
* MongoDB 8.0
* Docker
* Docker Compose
* Postman

## Features

* Convert Celsius to Fahrenheit
* Convert Fahrenheit to Celsius
* Store conversion history in MongoDB
* View conversion history
* Filter history by temperature unit
* Temperature warning checking
* Delete conversion history
* API Key security validation

## API Endpoints

Base URL:

```
http://localhost:8081/api/temperatures
```

### 1. Convert Temperature

**POST**

```
/convert?value=100&unit=C
```

Header:

```
API-Key: SUPER-SECRET-DEV-KEY-123
```

### 2. View History

**GET**

```
/history
```

### 3. Filter History

**GET**

```
/history/filter?unit=C
```

### 4. Warning Check

**GET**

```
/warning-check?value=100&unit=C
```

### 5. Delete History

**DELETE**

```
/history
```

## Docker Setup

Build and run the application:

```
docker compose up --build
```

Running containers:

* tempconverter-api
* tempconverter-mongodb

API runs on:

```
http://localhost:8081
```

MongoDB runs on:

```
localhost:27017
```

## Testing

API endpoints were tested using Postman with the required API Key header.

Example:

```
API-Key: SUPER-SECRET-DEV-KEY-123
```

## Project Status

Successfully deployed using Docker Compose with Spring Boot API and MongoDB database.
