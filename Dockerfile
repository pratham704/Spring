FROM openjdk:21-oracle

COPY target/NewPrathams-0.0.1-SNAPSHOT.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "NewPrathams-0.0.1-SNAPSHOT.jar"]
