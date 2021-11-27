# open-api-gen-poc

## Run as Spring Application

Prerequisites:
- Maven 3.6.3 or higher
- Java 8 or higher

Open the project in your favorite IDE and run `mvn generate-sources`.
Then run spring-boot application : `mvn spring-boot run`

You should see `Tomcat initialized with port(s): 8080 (http)`

Your application is accessible at `http://localhost:8080/poc`

Automatically generated, interactive user interface is available at `http://localhost:8080/poc/swagger-ui/`

And generated docs at `http://localhost:8080/poc/documentation/v3/api-docs`

Try modifying any OpenApi spec file (the .yaml files in the `src/main/resources/` directory) then re-generate sources.

## Run Schemathesis tests

Prerequisites:
- Python3

Create a virtual environment with `python3 -m venv pocvenv`

Activate the virtual environment with `source pocvenv/bin/activate`

Install `schemathesis` with `pip install schemathesis`

Make sure your application is running with `mvn spring-boot run`

Run Schemathesis tests with `schemathesis run src/main/resources/todo.yaml --checks=all --base-url=http://localhost:8080/poc/todo/v1`

Try modifying the "Todo" api implementation (src/main/java/com/decathlon/poc/api/TodoImpl.java) and run Schemathesis tests again 
