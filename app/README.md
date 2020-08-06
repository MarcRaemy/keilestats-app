# keilestats-app
This project contains a REST API for Statistics of a just-for-fun ice hockey team. It is build using Spring Boot -
The simple Webservice is intended to be used by Clients to save and read Game-Statistics of a just-for-fun Ice-Hockey-Team to and from a database.
To run the Webservice:

1. Import the project into your IDE / on your machine as a Maven project
2. All the dependecies and an embeded Tomcat-Webserver should be imported automatically, if not, compile and build the pom.xml-file with Maven again.
3. At the current development stage, a H2 in Memory Database is used for the persistence layer. It can be accessed via: "http://localhost:8080/h2-console"
(It is easy to change the persistence layer. To configure the connection to the database, open the "application.properties" file in the source/main/resources folder. There, you must change the url, username, password according to your database credentials. The dependency to the corresponding database has to be set in the pom.xml file)
4. Launch the application by running the class KeileStatsApplication in folder 
src/main/java
5. To test the endpoints of the API, go to http://localhost8080/swagger-ui.html. A Swagger representation of the project should have been generated and be accessible over this address. There, the endpoints are presented and can be tested.