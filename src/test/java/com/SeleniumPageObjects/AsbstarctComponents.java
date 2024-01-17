package com.SeleniumPageObjects;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SeleniumTest.OrderPage;

public class AsbstarctComponents {

	WebDriver driver;
	
	@FindBy(css="[routerlink*='cart']")
    WebElement cart;
	
	@FindBy(css="[routerlink*='myorders']")
    WebElement orders;
	
	protected AsbstarctComponents(WebDriver driver)
    {
   	 this.driver=driver;
   	PageFactory.initElements(driver, this);
    }
	
	public void WaitForElementToAppear(By findBy)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated((findBy)));
	}
	public void waitForElementToDisappear(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
	public CartPage cartClick()
	{
		cart.click();
		CartPage cp = new CartPage(driver);
		return cp;
	}
	public OrderPage orderPageclick() {
		orders.click();
		OrderPage op = new OrderPage(driver);
		return op;
	}
	
}
