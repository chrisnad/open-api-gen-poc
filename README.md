# open-api-gen-poc

## Run as Spring Application

Prerequisites:
- Maven 3.6.3 or higher
- Java 8 or higher

Open sources in your favorite IDE as a Maven project and run `mvn generate-sources`.
Then run spring-boot application : `mvn spring-boot run`

You should see `Tomcat initialized with port(s): 8080 (http)`

Your application is accessible at `http://localhost:8080/poc`

A UI representation is available at `http://localhost:8080/poc/swagger-ui.html`

Try modifying any OpenApi spec file (the .yaml files in the `src/main/resources/` directory) then re-generate sources.
