package com.SeleniumPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut extends AsbstarctComponents {

	WebDriver driver;
	CheckOut(WebDriver driver)
    {
		super(driver);
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	@FindBy(css=".action__submit")
	WebElement submit;
	
	@FindBy(xpath="//button[contains(@class,'ta-item')][2]")
	WebElement selectcountry;
	
	public void selectcountry(String countryname )
	{
		Actions a = new Actions(driver);
		a.sendKeys(country, countryname).build().perform();
		selectcountry.click();
	}
	public Conformationpage submitOrder() {
		submit.click();
		return new Conformationpage(driver);
		
		
	}
}
