FROM openjdk:21-jdk-slim
RUN mkdir /app

COPY ./target/taxi-fleet-app.jar /app/

EXPOSE 11000

CMD ["java", "-jar", "/app/taxi-fleet-app.jar"]
