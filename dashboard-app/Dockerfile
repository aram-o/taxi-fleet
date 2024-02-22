FROM openjdk:21-jdk-slim
RUN mkdir /app

COPY ./target/dashboard-app.jar /app/

EXPOSE 11001

CMD ["java", "-jar", "/app/dashboard-app.jar"]
