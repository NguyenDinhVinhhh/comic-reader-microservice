FROM openjdk:17-jdk


WORKDIR /app

COPY target/country-service-0.0.1-SNAPSHOT.jar /app/country-service-0.0.1-SNAPSHOT.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/country-service-0.0.1-SNAPSHOT.jar"]