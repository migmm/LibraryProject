# Library
## Java, Spring Boot, and PostgreSQL Project

[![Java](https://img.shields.io/badge/Java-17-blue.svg)](https://www.oracle.com/java/) [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.4-brightgreen.svg)](https://spring.io/projects/spring-boot) [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-13.4-blue.svg)](https://www.postgresql.org/) [![Gradle](https://img.shields.io/badge/Gradle-8.2.1-brightgreen.svg)](https://gradle.org/)

This backend project is designed to simulate a library management system, allowing for the efficient creation, retrieval, updating, and deletion of library resources.

## Technologies Used

- **Java:** I use Java as the main programming language. Make sure you have [Java 17](https://www.oracle.com/java/) installed.

- **Spring Boot:** I use Spring Boot as the framework to build our application. You can learn more about Spring Boot [here](https://spring.io/projects/spring-boot).

- **PostgreSQL:** I use PostgreSQL as our relational database. Make sure you have [PostgreSQL 13.4](https://www.postgresql.org/) or higher installed and configured correctly.

- **Gradle:** This project is built with Gradle. You can learn more about Gradle [here](https://gradle.org/).


## Prerequisites

Before running the application, make sure you have the following installed:

- Java 17 or higher
- PostgreSQL 13.4 or higher


## Configuration

1. Clone this repository to your local machine.
   ```bash
   git clone https://github.com/migmm/library.git 
    ```
2. Create a PostgreSQL database for the project.

3. Configure the database properties in the application.properties (application.properties.sample is provided) or application.yml file within the project.

4. Run the application using your favorite IDE or Graddle.

    ### Windows
    ```bash
    gradlew bootRun
    ```
    
    ### Linux
    ```bash
    gradle bootRun
    ```

## Swagger documentation
http://localhost:8080/swagger-ui/index.html#/

## Contact

If you have any questions or comments about the project, feel free to contact me at hi@miguedev.com.