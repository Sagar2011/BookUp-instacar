FROM maven:3.6-jdk-8 AS build
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src src
RUN mvn -f pom.xml clean package -DskipTests=true


FROM openjdk:8
EXPOSE 8500
COPY --from=build /target/bookup-booking-service-0.0.1-SNAPSHOT.jar booking.jar
ENTRYPOINT ["java","-jar","booking.jar"]
