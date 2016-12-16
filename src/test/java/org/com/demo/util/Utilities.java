package org.com.demo.util;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Utilities 
{
	protected static WebDriver driver;
	public static String TC_Key;
	public static String portalName;
	public static ExtentReports extent;
	public static ExtentTest test;
	static File reportConfigFile = new File(System.getProperty("user.dir")+"extent.config.xml");
}
