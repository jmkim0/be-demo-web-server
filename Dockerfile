FROM eclipse-temurin:17-jre
COPY build/libs/be-demo-web-server-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]
