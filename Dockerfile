FROM openjdk:17-jdk-slim

COPY target/accountsservice-0.0.1-SNAPSHOT.jar accountsservice-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "accountsservice-0.0.1-SNAPSHOT.jar"]