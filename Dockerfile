# Use official Maven image to build the project
FROM maven:3.8.3-openjdk-17 as builder
WORKDIR /veta
COPY . /veta
ENTRYPOINT   mvn clean install -DskipTests && mvn liquibase:update