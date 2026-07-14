# Temperature Converter API

A RESTful Temperature Converter API developed using Spring Boot, MongoDB, and Docker Compose.

This application converts temperatures between Celsius and Fahrenheit, stores conversion history in MongoDB, provides temperature warning messages, filters conversion records by unit, and allows users to delete stored history. The application is deployed using Docker Compose.

## Technologies Used

- Java 21
- Spring Boot
- Spring Data MongoDB
- MongoDB 8.0
- Maven
- Docker
- Docker Compose
- REST API
- Postman
- Git
- GitHub

## Features

- Convert temperatures between Celsius and Fahrenheit
- Convert Fahrenheit to Celsius
- Store temperature conversion history in MongoDB
- Retrieve all conversion history
- Filter history by temperature unit
- Check temperature warning conditions
- Delete conversion history
- API Key validation
- Docker Compose deployment

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

## Convert Temperature

Method: POST

Endpoint:

```text
/convert?value=100&unit=C
```

Header:

```text
API-Key: SUPER-SECRET-DEV-KEY-123
```

Description:

Converts the given temperature value into the opposite temperature unit and stores the conversion record in MongoDB.

## View History

Method: GET

Endpoint:

```text
/history
```

Description:

Retrieves all stored temperature conversion records from MongoDB.

## Filter History

Method: GET

Endpoint:

```text
/history/filter?unit=C
```

Description:

Retrieves conversion history filtered by the selected temperature unit.

## Warning Check

Method: GET

Endpoint:

```text
/warning-check?value=100&unit=C
```

Description:

Checks the temperature value and returns a warning message if the temperature reaches a dangerous level.

## Delete History

Method: DELETE

Endpoint:

```text
/history
```

Description:

Deletes all stored temperature conversion records.

## Docker Deployment

The application is containerized using Docker Compose.

The deployment includes two containers:

- tempconverter-api
- tempconverter-mongodb

Build and run the application:

```bash
docker compose up --build
```

Check running containers:

```bash
docker ps
```

API URL:

```text
http://localhost:8081
```

MongoDB Port:

```text
27017
```

## Testing

The REST API endpoints were tested using Postman.

The following operations were successfully verified:

- Temperature conversion
- Conversion history retrieval
- History filtering
- Temperature warning checking
- History deletion
- API Key validation

## Database

MongoDB is used as the database for storing temperature conversion records.

Stored information includes:

- Input temperature value
- Input temperature unit
- Converted temperature value
- Converted temperature unit
- Warning message
- Conversion record ID

## Project Status

The Temperature Converter API was successfully developed using Spring Boot, MongoDB, and Docker Compose.

The application was tested using Postman and successfully deployed using Docker containers. All implemented REST API features are working correctly.