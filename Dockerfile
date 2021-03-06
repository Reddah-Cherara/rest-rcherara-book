FROM jeanblanchard/java:8
LABEL environement="dev" service="book" owner="rcherara"
LABEL Description="This image is used to start the rest-example executable" Vendor="API Books" Version="1.0"
MAINTAINER rcherara
WORKDIR /opt/rest-example/
COPY target/rest-example-*.jar rest-example.jar
CMD java -jar rest-example.jar
#  The EXPOSE instruction informs Docker that the container listens on the specified network ports at runtime.
EXPOSE 7680
