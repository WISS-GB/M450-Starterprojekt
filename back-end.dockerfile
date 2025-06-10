# FROM maven:3.8.2-jdk-8 # for Java 8
FROM maven:3.9.9-eclipse-temurin-21-noble

WORKDIR /starter-project
COPY src/back-end/ .

RUN mvn clean install

CMD mvn spring-boot:run