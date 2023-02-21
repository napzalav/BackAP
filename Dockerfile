FROM amazoncorretto:11-alpine-jdk 
MAINTAINER cesar 
COPY target/cesar-0.0.1-SNAPSHOT.jar  cesar-app.jar
ENTRYPOINT ["java","-jar","/cesar-app.jar"]