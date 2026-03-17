FROM eclipse-ecipse-temurin:17-jdk-alpine 
EXPOSE 8080
ADD target/api-rest-springboot-gitactions.jar api-rest-springboot-gitactions.jar
ENTRYPOINT ["java", "-jar", "api-rest-springboot-gitactions.jar"]