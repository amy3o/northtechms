FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY pom.xml .
RUN apk add --no-cache maven && mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

EXPOSE 8082

CMD ["java", "-jar", "target/delivery-service-1.0.0.jar"]
