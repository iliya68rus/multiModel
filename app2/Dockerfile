FROM gradle:8.6-jdk17 AS builder
WORKDIR /app
COPY . .
RUN gradle :app2:build --no-daemon

FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/app2/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]