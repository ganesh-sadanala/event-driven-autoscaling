FROM azul/zulu-openjdk:22.0.1-jdk

WORKDIR /app

COPY target/keda-ms1-1.0-SNAPSHOT.jar /app/keda-user-microservice.jar
COPY src/main/resources/schema.sql /app/schema.sql
COPY src/main/resources/data.sql /app/data.sql

CMD ["java", "-jar", "keda-user-microservice.jar"]
