FROM openjdk:17-jdk

LABEL authors="vinh"

WORKDIR /app

COPY target/category-service-0.0.1-SNAPSHOT.jar /app/category-service-0.0.1-SNAPSHOT.jar

EXPOSE 8081

ENTRYPOINT ["java","-jar","/app/category-service-0.0.1-SNAPSHOT.jar"]