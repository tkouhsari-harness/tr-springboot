FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/{{cookiecutter.project_slug}}.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
