FROM openjdk:8-alpine

COPY ./target/*.jar ./app/app.jar

COPY ./data/orders.txt ./app/data/orders.txt

WORKDIR /app

EXPOSE 8080:8080

ENTRYPOINT ["java","-jar","app.jar"]
