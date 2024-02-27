# Getting Started

Welcome to our project! This project is based on Spring Boot and interacts with a PostgreSQL database via JOOQ. Our API documentation is available via Swagger and we use Liquibase for database migrations. Task tracking is conducted on Trello.

## Reference Documentation
For more details, you might want to check the following sections:

* [Spring Boot Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/features.html)
* [Official Apache Maven Documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Guide to create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#data.sql.jooq)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/#howto.data-initialization.migration-tool.liquibase)
* [jOOQ cook book](https://www.jooq.org/doc/3.19/manual/)

## Task Tracking
* Our current tasks can be found on our [Trello Board](https://trello.com/b/uaZkSku9/demo-spring-jook).

## Common Issues
If you face issues with lingering processes on macOS, you can delete a lingering PID using the following commands:
```sh
lsof -n -i4TCP:8080 
lsof -n -i4TCP:8080 kill -9 PID
```

## Using Docker
To start the Docker container for the PostgreSQL database, run:
```sh
docker-compose up --build --force-recreate -d
```

## API Documentation
Our API documentation is available via Swagger at the following URLs when the application is running:
* [API Docs](http://localhost:8080/v3/api-docs)
* [Swagger UI](http://localhost:8080/swagger-ui.html)
* [API Docs in YAML](http://localhost:8080/v3/api-docs.yaml)

For more information on Swagger, refer to [Swagger Springdoc](https://springdoc.org/#spring-webmvc-support).
