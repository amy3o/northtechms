# 1️⃣ Use official OpenJDK 17 as base image
FROM openjdk:17-jdk-slim

# 2️⃣ Set working directory inside container
WORKDIR /app

# 3️⃣ Copy the Maven build files (pom.xml + source) into container
COPY pom.xml .
COPY src ./src

# 4️⃣ Build the project using Maven
# Install Maven inside the image temporarily
RUN apt-get update && apt-get install -y maven && \
    mvn clean package -DskipTests && \
    apt-get remove -y maven && \
    rm -rf /var/lib/apt/lists/*

# 5️⃣ Copy the built JAR to a new image (smaller)
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=0 /app/target/auth-service-0.0.1-SNAPSHOT.jar app.jar

# 6️⃣ Expose port (Spring Boot default is 8080)
EXPOSE 8080

# 7️⃣ Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
