FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY aplicacion /tmp/aplicacion/
COPY dominio /tmp/dominio/
COPY infraestructura /tmp/infraestructura/
COPY common /tmp/common/
COPY configuration /tmp/configuration/

WORKDIR /tmp/
RUN mvn clean install -Pdocker

FROM openjdk:8-jdk-alpine
COPY --from=MAVEN_TOOL_CHAIN /tmp/configuration/target/configuration-1.0.jar app.jar

RUN sh -c 'touch /app.jar'

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]