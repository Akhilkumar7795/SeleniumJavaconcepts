package com.SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.SeleniumPageObjects.AsbstarctComponents;

public class OrderPage extends AsbstarctComponents {

	WebDriver driver;
	public OrderPage(WebDriver driver)
    {
		super(driver);
   	 this.driver=driver;
   	 PageFactory.initElements(driver,this);
    }
}
