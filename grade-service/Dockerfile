FROM openjdk:17
EXPOSE 8082
ADD target/grade-service-0.0.1-SNAPSHOT.jar grade-service.jar
ENTRYPOINT ["java", "-jar", "grade-service.jar"]