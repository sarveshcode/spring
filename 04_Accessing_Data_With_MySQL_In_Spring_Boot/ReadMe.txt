https://spring.io/guides/gs/accessing-data-mysql/

Accessing data with MySQL
------------------------------
This guide walks you through the process of creating a Spring application connected with a MySQL Database,
as opposed to an in-memory, embedded database, which all of the other guides and many sample apps use.
It uses Spring Data JPA to access the database, but this is only one of many possible choices
(e.g. you could use plain Spring JDBC).

pom.xml
--------------------

<!-- JPA Data (We are going to use Repositories, Entities, Hibernate, etc...) -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<!-- Use MySQL Connector-J -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

Create the application.properties file
--------------------------------------------
Spring Boot gives you defaults on all things, the default in database is H2, so when you want to change this and use
any other database you must define the connection attributes in the application.properties file.

In the sources folder, you create a resource file src/main/resources/application.properties

spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root

-------------
CREATE TABLE user (
id INT NOT NULL AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
PRIMARY KEY (id)
);

--------------

http://localhost:8080/add?name=neha&email=neha@gmail.com
Saved User{id=2, name='neha', email='neha@gmail.com'}

http://localhost:8080/all
[{"id":1,"name":"raj","email":"raj@gmail.com"},{"id":2,"name":"neha","email":"neha@gmail.com"}]

--------------