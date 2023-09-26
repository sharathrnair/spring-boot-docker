## Package, Build Docker Image & Run Spring Boot App

### By Maven

```sh
# Package
$ mvn package -Dmaven.test.skip=true

# Build Docker image
$ mvn install dockerfile:build -Dmaven.test.skip=true

# Run it
$ mvn spring-boot:run
```

### By Gradle

```sh
# Package
$ ./gradlew build

# Build Docker image
$ ./gradlew build docker

# Run it
$ java -jar build/libs/spring-boot-docker-0.1.0.jar
```
