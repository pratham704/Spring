FROM openjdk:17-oracle

ARG JAR_FILE=target/NewPrathams-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app.jar"]
