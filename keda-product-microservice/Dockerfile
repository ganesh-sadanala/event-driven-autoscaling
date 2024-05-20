FROM azul/zulu-openjdk:22.0.1-jdk

WORKDIR /app

COPY target/keda-ms2-1.0-SNAPSHOT.jar /app/keda-product-microservice.jar
COPY src/main/resources/schema.sql /app/schema.sql
COPY src/main/resources/data.sql /app/data.sql

CMD ["java", "-jar", "keda-product-microservice.jar"]
