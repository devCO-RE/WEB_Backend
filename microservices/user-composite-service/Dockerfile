FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG USER_COMPOSITE_JAR=./build/libs/*.jar
ADD ${USER_COMPOSITE_JAR} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]