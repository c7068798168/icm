# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
#WORKDIR /app

# Copy the compiled Java application JAR file into the container at /app
#COPY target/icm-0.0.1-SNAPSHOT.jar /app/icm.jar
COPY target/icm-0.0.1-SNAPSHOT.jar icm.jar

EXPOSE 8081
# Command to run the Java application
CMD ["java", "-jar", "icm.jar"]
