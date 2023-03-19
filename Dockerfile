FROM openjdk
COPY ./target/Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]