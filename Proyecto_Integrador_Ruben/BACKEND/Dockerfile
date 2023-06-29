FROM amazoncorretto:11-alpine-jdk
MAINTAINER ROC
COPY target/roc-0.0.1-SNAPSHOT  roc-app.jar
ENTRYPOINT ["java","-jar","/roc-app.jar"]