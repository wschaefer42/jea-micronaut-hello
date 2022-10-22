FROM openjdk:17-slim
COPY build/libs/*-all.jar app.jar
CMD ["java", "-jar", "app.jar"]