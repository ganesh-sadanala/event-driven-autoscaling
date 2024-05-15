FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/keda-ms1-1.0-SNAPSHOT.jar /app/keda-user-microservice.jar

CMD ["java", "-jar", "keda-user-microservice.jar"]
