package com.testing.rojgar;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
//@EnableAuthorizationServer
//@EnableResourceServer
public class RojgarApplication {
	private static final Logger logger = LoggerFactory.getLogger(RojgarApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RojgarApplication.class, args);
		if (logger.isDebugEnabled()) {
			logger.debug(RojgarApplication.class + " Reached to Main Class Successfully");
		}
		SpringApplication.run(RojgarApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/api/*"))
				.apis(RequestHandlerSelectors.basePackage("com.testing")).build().apiInfo(apiDetails());

	}

	private ApiInfo apiDetails() {
		return new ApiInfo("Smart Nagarik API", "Api for User Registration", "1.0", "No Tearms and Conditions",
				new springfox.documentation.service.Contact("Smart Nagarik", "smartnagarik.com.np",
						"dev.smartnagarik@gmail.com"),
				"No Need of License", "smartnagarik.com.np", Collections.emptyList());
	}
}