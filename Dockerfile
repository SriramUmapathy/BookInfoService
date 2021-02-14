FROM openjdk:8-jre-alpine

EXPOSE 8080

COPY ./target/github-actions-gke-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "github-actions-gke-0.0.1-SNAPSHOT.jar"]