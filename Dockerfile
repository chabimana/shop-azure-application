FROM adoptopenjdk/openjdk11
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY target/*.jar app.jar
COPY src/main/resources/data.json data.json
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]
