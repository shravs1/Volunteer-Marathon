package com.cognizant.application;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebListener
public class ApplicationExecutionListener implements ServletContextListener {
	private static final Logger LOGGER = LogManager.getLogger(ServletContextListener.class);
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		LOGGER.info("Inside Context Initialized");
		ServletContextListener.super.contextInitialized(sce);
		LOGGER.info("Leaving Context Initialized");
	}

}
