# Temperature Converter API

A Spring Boot based Temperature Converter application that converts temperatures between Celsius and Fahrenheit.

This project provides a REST API with MongoDB database integration and a simple web frontend using HTML, CSS, and JavaScript.

## Features

- Convert Celsius to Fahrenheit
- Convert Fahrenheit to Celsius
- Temperature warning checking
- Store conversion history
- View previous conversions
- Clear conversion history
- API Key authentication security
- MongoDB database integration
- Simple and user-friendly web interface

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB
- Maven
- HTML5
- CSS3
- JavaScript
- Postman

## Project Structure

```
tempconverter
│
├── src
│   └── main
│       ├── java
│       │   └── com.example.tempconverter
│       │       ├── controller
│       │       ├── service
│       │       ├── repository
│       │       ├── model
│       │       ├── exception
│       │       ├── filter
│       │       └── TempconverterApplication.java
│       │
│       └── resources
│           ├── static
│           │   ├── index.html
│           │   ├── style.css
│           │   └── script.js
│           │
│           └── application.properties
│
├── pom.xml
└── README.md
```

## API Endpoints

## 1. Convert Temperature

Method:

```
POST
```

URL:

```
http://localhost:8081/api/temperatures/convert
```

Example:

```
value = 25
unit = C
```

Response:

```json
{
  "inputValue": 25.0,
  "inputUnit": "C",
  "convertedValue": 77.0,
  "convertedUnit": "FAHRENHEIT",
  "warning": "Temperature is safe."
}
```

## 2. View Conversion History

Method:

```
GET
```

URL:

```
http://localhost:8081/api/temperatures/history
```

## 3. Clear History

Method:

```
DELETE
```

URL:

```
http://localhost:8081/api/temperatures/history
```

## 4. Check Temperature Warning

Method:

```
GET
```

URL:

```
http://localhost:8081/api/temperatures/warning-check
```

## API Key Authentication

This API uses API Key authentication to protect API endpoints.

Required Header:

```
X-API-KEY: SUPER-SECRET-DEV-KEY-123
```

If an incorrect API key is provided:

```
Invalid API Key
```

## Database

MongoDB is used to store temperature conversion history.

MongoDB connection:

```
localhost:27017
```

Stored data:

- Input temperature value
- Input unit
- Converted value
- Converted unit
- Warning message

## Running the Application

Requirements:

- Java 21
- Maven
- MongoDB


Run the application:

```
.\mvnw.cmd spring-boot:run
```

Application starts on:

```
http://localhost:8081
```

## Frontend Usage

Open browser:

```
http://localhost:8081
```

The web interface allows users to:

- Enter temperature value
- Select Celsius or Fahrenheit
- Convert temperature
- View history
- Check temperature warnings
- Clear history

## Testing

API testing was performed using:

- Postman
- Web Browser

Test cases:

- Celsius to Fahrenheit conversion
- Fahrenheit to Celsius conversion
- Safe temperature checking
- Dangerous temperature warning
- History retrieval
- History deletion

## Future Improvements

- User login system
- Swagger API documentation
- Docker deployment
- Unit testing
- Cloud database integration

## Author

Imashi Shashikala