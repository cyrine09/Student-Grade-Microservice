FROM openjdk:17
EXPOSE 8081
ADD target/student-service-0.0.1-SNAPSHOT.jar student-service.jar
ENTRYPOINT ["java", "-jar", "student-service.jar"]