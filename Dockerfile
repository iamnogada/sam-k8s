FROM maven:3.8.1-jdk-11 AS build

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package -DskipTests

FROM openjdk:11

RUN mkdir /app
WORKDIR /app
COPY --from=build /usr/src/app/target/*.jar /app/app.jar 
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app/app.jar"]