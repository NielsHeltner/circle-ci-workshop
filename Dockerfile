FROM openjdk:8

COPY src /

ENTRYPOINT ["ls"]
