FROM openjdk:11
WORKDIR /app
COPY target/ /app
EXPOSE 8080
CMD ["java", "-jar"]