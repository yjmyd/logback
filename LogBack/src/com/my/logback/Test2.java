package com.my.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;

public class Test2 {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger("com.my.logback.Test");
		logger.debug("Hello world.");
		
		LoggerContext lc = (LoggerContext)LoggerFactory.getILoggerFactory();
		StatusPrinter.print(lc);
	}

}
