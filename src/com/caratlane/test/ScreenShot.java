/*package com.caratlane.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeMethod;

import generic.BaseTest;

public class ScreenShot extends BaseTest
{public static WebDriver driver;
static
{
System.setProperty(CHROME_KEY,CHROME_VALUE);
}

public static void main(String args[]) throws Exception
{

	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://www.caratlane.com");
	
	SimpleDateFormat sd=new SimpleDateFormat("DD_MM_YY_hh_mm_ss");
	Object v = sd.format(new Date());
	TakesScreenshot ts=(TakesScreenshot)driver;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	File destfile=new File("/home/tyss/Desktop/pic"+v+".png");
	FileUtils.copyFile(srcfile, destfile);
	driver.close();
	
}}
*/