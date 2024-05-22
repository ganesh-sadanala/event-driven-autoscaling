FROM azul/zulu-openjdk:22.0.1-jdk

WORKDIR /app

COPY target/keda-ms1-1.0-SNAPSHOT.jar /app/keda-service-registry.jar

CMD ["java", "-jar", "keda-service-registry.jar"]
