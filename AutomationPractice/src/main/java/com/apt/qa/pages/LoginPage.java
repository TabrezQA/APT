package com.apt.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.apt.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
	@FindBy(xpath="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement signinbtn;
	

	
	//Initializing the Page Objects:
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Actions:

	
	public void login(){
		signinbtn.click();
	}
	
}
