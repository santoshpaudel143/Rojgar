package com.testing.rojgar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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
}