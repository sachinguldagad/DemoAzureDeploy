FROM openjdk:8
ADD target/revision.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","app.jar"]