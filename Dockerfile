FROM openjdk:11-jre
COPY ./build/libs/Spring-Main-*-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
