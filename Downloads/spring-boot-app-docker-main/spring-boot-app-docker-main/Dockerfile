FROM openjdk:23-slim
WORKDIR /app
COPY target/spring-boot-docker-1.0.0.jar .
EXPOSE 9099
ENTRYPOINT ["java","-jar","spring-boot-docker-1.0.0.jar"]