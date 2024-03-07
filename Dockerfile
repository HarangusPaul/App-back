FROM amazoncorretto:17
ADD target/springboot-appback-docker.jar springboot-appback-docker.jar
ENTRYPOINT ["java","-jar","/springboot-appback-docker.jar"]
EXPOSE 8080