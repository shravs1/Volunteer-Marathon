package com.cognizant.application;

import java.net.URISyntaxException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.cognizant")
@ServletComponentScan
@EnableJpaRepositories(basePackages="com.cognizant.event.repository")
@EntityScan(basePackages="com.cognizant.event.bo")
public class Application {
	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) throws URISyntaxException, SQLException {
		LOGGER.debug("Application stated from main calss");
		SpringApplication.run(Application.class, args);
	}
	
}