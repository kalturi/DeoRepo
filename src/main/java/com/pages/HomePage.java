package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
private WebDriver driver;
	
	public HomePage(WebDriver Driver){
		this.driver=Driver;
	}
	
	private By TodaysDealsButton=By.xpath("//a[contains(@href,'goldbox')]");
	private By DealOfTheDay=By.xpath("//div[contains(@class,'a-spacing-top-base')] /h1");
	
	
	public void TodaysDealsButton(){
		 driver.findElement(TodaysDealsButton).click();
	}
	public String DealOfTheDay(){
		 return driver.findElement(DealOfTheDay).getText();
				
	}
	
}
