package com.my.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {

	public static void main(String[] args) {
			Logger logger = LoggerFactory.getLogger("com.my.logback.Test");
			logger.debug("Hello world.");
	}

}
