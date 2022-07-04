package com.jjm.base;

import org.apache.log4j.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.jjm.utilities.ExcelReader;
import com.jjm.utilities.ExtentManager;


public class TestBase {
	
	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExcelReader excel = new ExcelReader(
			System.getProperty("user.dir") + "\\src\\test\\resources\\excel\\testdata.xlsx");
	public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;
	
	final static String url = "https://uat-jaljeevan.choicetechlab.com/api";

}
