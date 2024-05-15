FROM openjdk:11-jre-slim

WORKDIR /app

COPY target/keda-ms2-1.0-SNAPSHOT.jar /app/keda-product-microservice.jar

CMD ["java", "-jar", "keda-product-microservice.jar"]
