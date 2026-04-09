FROM openjdk:17
COPY target/simple-java-app-1.0.jar app.jar
CMD ["java", "-jar", "app.jar"]