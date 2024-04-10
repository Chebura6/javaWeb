FROM openjdk:19-alpine
ARG JAR_FILE=out/artifacts/Pancakes_jar/Pancakes.jar
COPY ${JAR_FILE} Pancakes.jar
ENTRYPOINT ["java","-jar","Pancakes.jar"]