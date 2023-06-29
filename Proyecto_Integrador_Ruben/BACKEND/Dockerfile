FROM amazoncorretto:17-alpine-jdk
MAINTAINER ROC
COPY target/roc-0.0.1-SNAPSHOT.jar  roc-app.jar
ENTRYPOINT ["java","-jar","/roc-app.jar"]