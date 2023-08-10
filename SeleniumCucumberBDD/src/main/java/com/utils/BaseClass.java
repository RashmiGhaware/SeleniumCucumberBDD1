package com.utils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  static WebDriver driver;

	public static BaseClass baseclass;
	public final static int TIMEOUT = 10;

	private BaseClass()
	{ 
		//String projectPath=System.getProperty("user.dir");
		//System.out.println(projectPath);
		//System.setProperty("webdriver.chrome.driver",projectPath+ "/src/test/resources/Driver1/chromedriver.exe"); 
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
		 * driver.manage().window().maximize();
		 */
		BaseClass.setUpDriver();
	}
	public static void openPage(String url)
	{
		driver.get(url);
	}
	public static WebDriver getDriver()
	{
		return driver;
	}

	public static void setUpDriver()
	{
		String projectPath=System.getProperty("user.dir");

		System.out.println(projectPath);

		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/Driver2/chromedriver.exe"); 
		driver=new ChromeDriver();

		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		/*
		 * if (baseclass!= null) { baseclass=new BaseClass(); }
		 */

	}
	public static void tearDown()
	{
		if (driver!= null)
		{
			driver.close();
			driver.quit();
		}
		baseclass=null;
	}

}
