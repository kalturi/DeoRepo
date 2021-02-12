package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage(WebDriver Driver){
		this.driver=Driver;
	}
	
	private By username=By.id("username");
	private By pwd=By.id("Password");
	private By loginbutton=By.xpath("//span[text()='Continue']");
	
	
	public String getLoginTitle(){
		return driver.getTitle();
	}
	
	public void getemail(String uname){
		driver.findElement(username).sendKeys(uname);
		
	}
	public void getpwd(String password){
		driver.findElement(pwd).sendKeys(password);
	}
	
	public void loginbutton(){
		driver.findElement(loginbutton).click();
	}
	
	
	
	
}