FROM openjdk:17-alpine
EXPOSE 80
RUN mkdir /app
COPY target/chat-0.0.1-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]