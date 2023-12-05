FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/DZ2-0.0.1-SNAPSHOT.jar authoriation.jar

CMD ["java","-jar", "authoriation.jar"]
