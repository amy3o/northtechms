# Use OpenJDK 17
FROM eclipse-temurin:17-jdk-alpine

# Set work directory
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN apk add --no-cache maven && mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build jar
RUN mvn clean package -DskipTests

# Expose port
EXPOSE 8081

# Run application
CMD ["java", "-jar", "target/tracking-service-1.0.0.jar"]
