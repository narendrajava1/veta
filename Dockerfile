# Use official Maven image to build the project
FROM maven:3.8.3-openjdk-17 as builder
WORKDIR /veta
COPY . /veta
RUN mvn clean install -DskipTests


# Use a smaller image for runtime
FROM openjdk:17
WORKDIR /veta
COPY --from=builder  /veta/cattle-manage/target/*.jar cattle-manage.jar

ENTRYPOINT  ["java", "-jar", "cattle-manage.jar"]