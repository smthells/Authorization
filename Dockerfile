FROM openjdk:17

EXPOSE 8080

ADD build/libs/DZ2-0.0.1-SNAPSHOT.jar authoriation.jar

CMD ["java","-jar", "authoriation.jar"]
