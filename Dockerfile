FROM maven:3.9.5-openjdk-21 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:21-jdk-slim
COPY --from=build /target/User_Registration_Page-00.1-SNAPSHOT.jar User_Registration_Page.jar
EXPOSE 8080
ENTRYPOINT["java","jar","User_Registration_Page.jar"]
