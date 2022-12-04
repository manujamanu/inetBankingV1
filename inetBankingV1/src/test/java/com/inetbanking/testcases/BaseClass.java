package com.inetbanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/v3/index.php";
	public String username="mngr447902";
	public String password="esAnAbU";
	public WebDriver driver;
	
	@BeforeClass
	public void setUp()
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver=new FirefoxDriver();
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
		
	}
			

}
