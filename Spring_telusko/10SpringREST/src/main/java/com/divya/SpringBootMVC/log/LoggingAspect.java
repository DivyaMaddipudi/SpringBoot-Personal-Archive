package com.divya.SpringBootMVC.log;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);
	
	@Before("execution(public * com.divya.SpringBootMVC.controller.HomeController.getAliens())")
	public void logBefore() {
		
		LOGGER.info("getAliens method called");
	}

	@AfterReturning("execution(public * com.divya.SpringBootMVC.controller.HomeController.getAliens())")
	public void logAfter() {
		
		LOGGER.info("getAliens method executed");
	}
	
	@AfterThrowing("execution(public * com.divya.SpringBootMVC.controller.HomeController.getAliens())")
	public void logException() {
		
		LOGGER.info("Issue");
	}
}
