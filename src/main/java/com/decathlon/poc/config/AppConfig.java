package com.decathlon.poc.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.PathProvider;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.DefaultPathProvider;
import springfox.documentation.spring.web.paths.Paths;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-10-27T10:57:52.953671+02:00[Europe/Paris]")
@Configuration
@EnableSwagger2
public class AppConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("OpenAPI Decathlon Proof Of Concept")
                .description("Some Description")
                .license("Apache-2.0")
                .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("christian nader", "", "christian.nader@decathlon.com"))
                .build();
    }

    @Bean
    public Docket customImplementation(ServletContext servletContext, @Value("${server.servlet.contextPath:/}") String basePath) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.decathlon.poc"))
                .paths(PathSelectors.any())
                .build()
                .pathProvider((PathProvider) new BasePathAwareRelativePathProvider(servletContext, basePath))
                .apiInfo(apiInfo());
    }

    class BasePathAwareRelativePathProvider extends DefaultPathProvider {
        private String basePath;

        public BasePathAwareRelativePathProvider(ServletContext servletContext, String basePath) {
            this.basePath = basePath;
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return Paths.removeAdjacentForwardSlashes(
                    uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath, "")).build().toString());
        }
    }

}
