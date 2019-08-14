FROM openjdk:8

COPY src /src/

ENTRYPOINT ["ls src"]
