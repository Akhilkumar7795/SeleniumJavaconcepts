package com.SeleniumPageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends AsbstarctComponents {

	WebDriver driver;
	CartPage(WebDriver driver)
    {
		super(driver);
   	 this.driver=driver;
   	 PageFactory.initElements(driver, this);
    }
	@FindBy(css=".cartSection h3")
	List<WebElement> cartitems;
	
	@FindBy(css=".totalRow button")
	WebElement checkout;
	
	
	public Boolean verifyProductDisplay(String productname)
	{
		Boolean match =cartitems.stream().anyMatch(cartProduct->cartProduct.getText().equalsIgnoreCase(productname));
		return match;
	}
	public CheckOut checkItemsOut() {
		checkout.click();
		return new CheckOut(driver);
	}
}
