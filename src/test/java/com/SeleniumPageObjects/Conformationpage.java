package com.SeleniumPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Conformationpage extends AsbstarctComponents {

	WebDriver driver;
	Conformationpage(WebDriver driver)
    {
		super(driver);
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }
	@FindBy(css=".hero-primary")
	WebElement text;
	
	public String getmainpageText() {
		return text.getText();
	}
}
