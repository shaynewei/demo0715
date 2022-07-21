FROM java:8
VOLUME /tmp
ADD target/demo0715*.jar /demo0715.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/demo0715.jar"]
