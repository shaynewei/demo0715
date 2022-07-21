FROM java:8
VOLUME /tmp
add ./target/demo0715-0.0.1-SNAPSHOT.jar /demo0715.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/demo0715.jar"]
