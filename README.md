# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Spring](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html)
* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#data.sql.jooq)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.liquibase)

### Task
* [Trello](https://trello.com/b/uaZkSku9/demo-spring-jook)


### delete PID on mac OS.
```shell
lsof -n -i4TCP:8080
```
```shell
kill -9 PID
```

### Docker
First, start the docker container for postgres database.
```shell
docker-compose up --build --force-recreate -d
```

### Clean Archi Example
* https://github.com/Choi-Jinwoo/spring-clean-architecture-example/tree/master

### Data 
Full data for countries: 
* https://github.com/dr5hn/countries-states-cities-database
* https://github.com/dr5hn/countries-states-cities-database/blob/master/csv/cities.csv
* https://dr5hn.github.io/countries-states-cities-database/

### Swagger
* [Swagger spring.doc (access to the API documentation on port 8080)](https://springdoc.org/#spring-webmvc-support)
  * http://localhost:8080/v3/api-docs
  * http://localhost:8080/swagger-ui.html
  * http://localhost:8080/v3/api-docs.yaml
* https://openapi-generator.tech/docs/configuration

### JOOK example
https://github.com/pkainulainen/jooq-with-spring-examples/blob/master/jooq-only/src/main/java/net/petrikainulainen/spring/jooq/todo/repository/JOOQTodoRepository.java