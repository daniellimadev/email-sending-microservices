
# Microservice E-mail project for Spring Boot!! 🚀🚀

### Microservice to send email with SMTP from Google

# Technologies used

* **Language:** Java 17
* **Versioning:** Git/GitHub
* **IDE:** IntelliJ IDEA Community Edition
* **Data Base:** Postgres
* **Framework:** Spring Boot
* **Messaging:** RabbitMQ

- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)

<br>


## ✏️Application structure design

##### BUSINESS MICROSERVICES
![Application structure design/BUSINESS MICROSERVICES.drawio.png](https://github.com/daniellimadev/email-sending-microservices/blob/main/Application%20structure%20design/BUSINESS%20MICROSERVICES.drawio.png)

##### FULL FLOW ASYNCHRONOUS COMMUNICATION
![Application structure design/FULL FLOW ASYNCHRONOUS COMMUNICATION.drawio.png](https://github.com/daniellimadev/email-sending-microservices/blob/main/Application%20structure%20design/FULL%20FLOW%20ASYNCHRONOUS%20COMMUNICATION.drawio.png)

##### CloudMQP
![Application structure design/CloudMQP.drawio.png](https://github.com/daniellimadev/email-sending-microservices/blob/main/Application%20structure%20design/CloudMQP.drawio.png)

<br>

## How to Execute

- Clone git repository
- Build the project:
```
$ ./mvnw clean package
```
- Run the application:
```
$ java -jar target/email-0.0.1-SNAPSHOT.jar

$ java -jar target/user-0.0.1-SNAPSHOT.jar
```

The Microservice email can be accessed at [localhost:8082](http://localhost:8082).

The Microservice user can be accessed at [localhost:8081](http://localhost:8081).

## API Endpoints

To make the HTTP requests below, the tool [Postman](https://www.postman.com/) was used:

- Create Task
```
$ POST http://localhost:8081/users

[
  {
    "name": "Debora",
    "email": "debora@gmail.com"
  }
]
```

<br>

<h3>Author</h3>

<a href="https://www.linkedin.com/in/danielpereiralima/">
 <img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/96916005?v=4" width="100px;" alt=""/>

Made by Daniel Pereira Lima 👋🏽 Contact!

[![Linkedin Badge](https://img.shields.io/badge/-Daniel-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/danielpereiralima/)](https://www.linkedin.com/in/danielpereiralima/)
