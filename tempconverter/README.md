# Temperature Converter API

A Spring Boot based Temperature Converter application that converts temperatures between Celsius and Fahrenheit.

## Features

- Convert Celsius to Fahrenheit
- Convert Fahrenheit to Celsius
- Temperature warning checking
- Store conversion history
- View previous conversions
- Clear conversion history
- API Key security
- MongoDB database integration
- Simple web frontend

## Technologies Used

- Java 21
- Spring Boot
- Spring Web
- Spring Data MongoDB
- MongoDB
- HTML
- CSS
- JavaScript
- Maven

## Project Structure
src
 └── main
     ├── java
     │    └── com.example.tempconverter
     │          ├── controller
     │          ├── service
     │          ├── repository
     │          ├── model
     │          ├── exception
     │          └── filter
     │
     └── resources
          └── static
               ├── index.html
               ├── style.css
               └── script.js

## API Endpoints

### Convert Temperature

POST

http://localhost:8081/api/temperatures/convert

Example:

value = 25  
unit = C

Response:

{
  "inputValue":25,
  "inputUnit":"C",
  "convertedValue":77,
  "convertedUnit":"FAHRENHEIT",
  "warning":"Temperature is safe."
}

### View History

GET

http://localhost:8081/api/temperatures/history


### Clear History

DELETE

http://localhost:8081/api/temperatures/history


### Check Temperature Warning

GET

http://localhost:8081/api/temperatures/warning-check


## API Key Authentication

All API requests require this header:

X-API-KEY : SUPER-SECRET-DEV-KEY-123


If the API key is incorrect:

Invalid API Key


## Database

MongoDB is used to store temperature conversion history.

MongoDB runs on:

localhost:27017


## Running the Application

Open terminal inside the project folder:

Run:

.\mvnw.cmd spring-boot:run


Application starts on:

http://localhost:8081


## Frontend

Open browser:

http://localhost:8081


The web interface allows users to:

- Enter temperature value
- Select temperature unit
- Convert temperature
- View history
- Check warnings
- Clear history


## Author

Temperature Converter Project