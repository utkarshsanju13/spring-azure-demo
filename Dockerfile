FROM adoptopenjdk/openjdk11:latest
EXPOSE 8110
ADD target/spring-azure-demo-0.0.1-SNAPSHOT.jar spring-azure-demo-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java", "-jar", "/spring-azure-demo-0.0.1-SNAPSHOT.jar"]