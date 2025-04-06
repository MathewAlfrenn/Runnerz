**Runnerz** is a  Application for saving runs built using **Spring Boot, PostgreSQL, Docker, Postman, and an Rest API** (onplaceholder.typicode.com). The primary goal of this project was for learning purposes, and it focuses on managing running data and saving it to a PostgreSQL database.

**Project Overview**

This project provides a simple running application that allows users to track their runs and store the data in a PostgreSQL database. The application uses Spring Boot for the backend, PostgreSQL for data storage, and Docker for containerization. The project also integrates with an external API (onplaceholder.typicode.com) for data management.

While this application is not intended for deployment, it serves as a learning tool to practice and understand the components involved.


**Features**

Track Runs: Users can log their run details such as distance, time, and date.
API Integration: The app integrates with a mock API (onplaceholder.typicode.com) for external data management.
PostgreSQL Database: Run data is stored in a PostgreSQL database, with simple CRUD operations available through the API.
Docker Support: The app is containerized using Docker to run PostgreSQL and Spring Boot in separate containers.
Postman API Collection: Predefined API requests to test the application are included in the Postman collection.
JUnit Testing: Unit tests written with JUnit to ensure the correctness of the application's logic and data handling.

**Installation**

Clone the Repository
To get started, clone the repository and navigate to the project folder:

```bash
git clone https://github.com/MathewAlfrenn/Runnerz.git
cd Runnerz
```
**Technologies Used**

**Spring Boot:** For building the backend API.
**PostgreSQL:** For storing run data.
**Docker:** For containerizing the application and database.
**Maven:** For project management and dependency handling.
**Postman:** **For testing the API endpoints.
**JUnit:** For unit testing the business logic.
**onplaceholder.typicode.com API:** For mock data integration.


**Requirements**

Make sure you have the following installed:

**Docker:** For running the containers.
