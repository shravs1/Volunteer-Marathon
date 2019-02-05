package com.cognizant.application;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages="com.cognizant")
@ServletComponentScan
public class Application {
	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public static void main(String[] args) throws URISyntaxException, SQLException {
		LOGGER.debug("Application stated from main calss");
		//SpringApplication.run(Application.class, args);
		getConnection();
	}
	
	private static Connection getConnection() throws URISyntaxException, SQLException {
	    URI jdbUri = new URI("mysql://qeoyr42ifleo9d6r:etb07ptwgl1qwtk7@ocvwlym0zv3tcn68.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/rvfdc5mi4hzbpkjo");

	    String username = jdbUri.getUserInfo().split(":")[0];
	    String password = jdbUri.getUserInfo().split(":")[1];
	    String port = String.valueOf(jdbUri.getPort());
	    String jdbUrl = "jdbc:mysql://" + jdbUri.getHost() + ":" + port + jdbUri.getPath();

	    return DriverManager.getConnection(jdbUrl, username, password);
	}
	
}