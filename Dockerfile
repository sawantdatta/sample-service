FROM openjdk:17
EXPOSE 8080
ADD target/sample-service-1.0.0.jar sample-service-1.0.0.jar
ENTRYPOINT ["java","-jar","sample-service-1.0.0.jar"]