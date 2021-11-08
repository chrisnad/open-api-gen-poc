package com.decathlon.poc;

import com.fasterxml.jackson.databind.Module;
import org.openapitools.jackson.nullable.JsonNullableModule;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.Serial;

@SpringBootApplication
@ComponentScan(basePackages = {"com.decathlon.poc", "com.decathlon.poc.petstore.api" , "com.decathlon.poc.petstore.config"})
public class PocApplication implements CommandLineRunner {


	@Override
	public void run(String... arg0) {
		if (arg0.length > 0 && arg0[0].equals("exitcode")) {
			throw new PocApplication.ExitException();
		}
	}

	public static void main(String[] args) {
		new SpringApplication(PocApplication.class).run(args);
	}

	static class ExitException extends RuntimeException implements ExitCodeGenerator {
		@Serial
		private static final long serialVersionUID = 1L;

		@Override
		public int getExitCode() {
			return 10;
		}

	}

	@Bean
	public WebMvcConfigurer webConfigurer() {
		return new WebMvcConfigurer() {
            /*@Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("*")
                        .allowedHeaders("Content-Type");
            }*/
		};
	}

	@Bean
	public Module jsonNullableModule() {
		return new JsonNullableModule();
	}


}
