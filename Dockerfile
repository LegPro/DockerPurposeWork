FROM openjdk:8-jdk-alpine
ENTRYPOINT ["java","-jar","./target/Customer-Service-0.0.1-SNAPSHOT.jar"]
EXPOSE 9090
