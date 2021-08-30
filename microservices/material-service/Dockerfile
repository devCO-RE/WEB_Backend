FROM openjdk:8-jdk-alpine
EXPOSE 8080
ARG MATERIAL_JAR=./build/libs/*.jar
ADD ${MATERIAL_JAR} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]