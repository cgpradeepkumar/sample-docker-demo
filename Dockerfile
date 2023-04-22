FROM java:8

EXPOSE 8080

ADD target/sample-docker-demo.jar sample-docker-demo.jar

ENTRYPOINT ["java", "-jar", "sample-docker-demo.jar"]