# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [JOOQ Access Layer](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#data.sql.jooq)
* [Liquibase Migration](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#howto.data-initialization.migration-tool.liquibase)

# Task
* [Trello](https://trello.com/b/uaZkSku9/demo-spring-jook)


## delete PID on mac OS.
```shell
lsof -n -i4TCP:8080
```
```shell
kill -9 PID
```

## Docker
First, start the docker container for postgres database.
```shell
docker-compose up --build --force-recreate -d
```