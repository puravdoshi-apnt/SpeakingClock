#Speaking Clock Project
The Speaking Clock project is a simple Spring Boot application that converts a given time in hours and minutes into words. It provides a RESTful API endpoint for this conversion and includes Swagger documentation for easy API exploration. This readme file outlines the project's components, how to run it, and its features.

###Project Overview
The Speaking Clock project comprises the following main components:

**SpeakingClockController:** This class defines the main RESTful API endpoint **(/convert)** that takes a time string as input and returns the time in words. The endpoint utilizes the `TimeConverter` class for the conversion logic.

**TimeConverter:** This class contains the core logic to convert time in hours and minutes to words. It includes arrays for mapping numbers to their word representations and handles different time formats.

**SwaggerConfig:** This class configures Swagger for API documentation. It uses Springfox to automatically generate API documentation based on annotations and class structures.

**Test Classes:** The project includes test classes to ensure the functionality of the TimeConverter class and API endpoint. TimeConverterTest tests the time conversion logic, while the SwaggerConfig doesn't require specific tests.

**Maven Configuration:** The pom.xml file includes project dependencies, such as Spring Boot, Springfox for Swagger, and testing libraries.

###Setup and Running
To set up and run the Speaking Clock project, follow these steps:

**1)**	Clone the repository to your local machine.

**2)**	Ensure you have JDK 17 and Maven installed.

**3)**	Open a terminal and navigate to the project root directory.

**4)**	Run the application using Maven: mvn spring-boot:run

**5)**	The application will start, and you can access the API documentation using the Swagger UI at (http://localhost:8585/swagger-ui.html)


###API Documentation
The Speaking Clock API documentation is automatically generated using Swagger. You can access the Swagger UI to explore the API endpoints, make requests, and view responses.

**1)**	Start the application as mentioned in the **Setup and Running** section.

**2)**	Open a web browser and go to (http://localhost:8585/swagger-ui.html)

**3)**	You will see the Swagger UI interface where you can find the available API endpoint **(/convert)** and test it by providing different time values.


###Testing
The Speaking Clock project includes unit tests to ensure the correctness of the **TimeConverter** logic. To run the tests, use the following steps:

**1)**	Navigate to the project root directory in a terminal.

**2)**	Run the tests using Maven: **mvn test**

**3)**	The tests will execute, and you will see the results in the terminal.


###Project Structure
The project is structured as follows:

**1)**	**src/main/java/com/example/demo:** Contains the main application and configuration classes.

**2)**	**src/test/java/com/example/demo:** Contains test classes for unit testing.

**3)**	**pom.xml:** Defines project dependencies and configuration for Maven.
