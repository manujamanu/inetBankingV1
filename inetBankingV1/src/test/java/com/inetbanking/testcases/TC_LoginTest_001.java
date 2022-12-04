package com.inetbanking.testcases;

import org.testng.annotations.Test;

import com.inetbanking.pageobject.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass
{
   @Test
   public void loginTest()
	{
		driver.get(baseURL);
		
		LoginPage lp=new LoginPage(driver);
		lp.setuserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		if(driver.getTitle().equals("Guru99 Bank Manager Homepage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
   
}
