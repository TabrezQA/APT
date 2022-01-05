package com.apt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.apt.qa.base.TestBase;
import com.apt.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();	
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		loginPage.login();
		String title = driver.getCurrentUrl();
		Assert.assertEquals(title, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
		
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
