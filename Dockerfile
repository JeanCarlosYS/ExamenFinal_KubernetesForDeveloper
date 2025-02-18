FROM eclipse-temurin:17-jdk-alpine-3.21

WORKDIR /root

EXPOSE 8082

COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

#DESCARGAR DEPENDENCIAS
RUN ./mvnw dependency:go-offline

#COPIAR CODIGO FUENTE DENTRO DEL CONTENEDOR
COPY ./src /root/src

#Construir nuestra app
RUN ./mvnw clean install -DskipTests

#Ejecutar app cuando el contenedor incia
ENTRYPOINT ["java","-jar","/root/target/AppClub-1.0.jar"]