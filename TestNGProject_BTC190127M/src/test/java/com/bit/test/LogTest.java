package com.bit.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class LogTest {
	@Test
	public void test1() throws FileNotFoundException
	{
		//FileInputStream f=new FileInputStream(new File("/Users/bittechconsulting/eclipse-workspace/new/TestNGProject_BTC190127M/log.properties"));
	//	PropertyConfigurator.configure(f);
		DOMConfigurator.configure("log.xml");
		Logger log=Logger.getLogger(LogTest.class.getName());
		log.fatal("fatal");
		log.error("error");
		log.warn("warn");
		log.info("info");
		log.debug("debug");
		log.trace("trace");
		
	}

}
