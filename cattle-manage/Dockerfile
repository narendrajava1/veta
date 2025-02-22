# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-slim
# Set the working directory in the container
WORKDIR /veta
# Copy the JAR file built by Maven into the container at /app
COPY  target/*.jar  /veta/cattle-manage.jar

ENTRYPOINT  ["java", "-jar", "/veta/cattle-manage.jar"]