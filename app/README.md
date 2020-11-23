# keilestats-app
This project contains a REAST-API for saving and reading Statistics of a just-for-fun ice hockey team to a database.

The project is written with Java Spring Boot using Maven. So you need to have Java SDK v1.6 or higher as well as Spring Boot and Maven installed.
For instructions: see https://docs.spring.io/spring-boot/docs/1.0.0.RC5/reference/html/getting-started-installing-spring-boot.html .

If the tools are installed succesfully you can run the Webservice as follows:

1. Import the project into your IDE as a Maven project. All the dependecies and an embeded Tomcat-Webserver are imported automatically, if not, compile and build the pom.xml-file with Maven again.
2. Launch the application by running the class KeileStatsApplication in folder src/main/java/ch.keilestats.app
3. To see the documentation and use the endpoints, go to http://localhost8080/swagger-ui.html. A Swagger representation of the project should be accessible there.
4. A H2 in Memory Database is used for the persistence layer in this version. It can be accessed via: "http://localhost:8080/h2-console"

