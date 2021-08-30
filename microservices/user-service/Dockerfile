FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG USER_SERVICE_JAR=./build/libs/*.jar
ADD ${USER_SERVICE_JAR} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]