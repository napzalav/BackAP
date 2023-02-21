#// en el ejemplo dice que el FROM es desde que imagen partimos pero no lo entendi
FROM amazoncorretto:11-alpine-jdk 
#// en MANTEINER va el nombre del dueño
MAINTAINER cesar 
#//en COPY va a copiar el empaquetado desde nuestro ordenador hacia Github, debemos copiar el empaquetado .jar (NO el que dice Original) y a continuacion le asignamos un nombre para construirlo
COPY target/cesar-0.0.1-SNAPSHOT.jar  cesar-app.jar
#//ENTRYPOINT es la instruccion que se va a ejecurar primero
ENTRYPOINT ["java","-jar","/cesar-app.jar"]