package com.SeleniumPageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue extends AsbstarctComponents {

	WebDriver driver;
	ProductCatalogue(WebDriver driver)
    {
		super(driver);
   	 this.driver=driver;
   	 PageFactory.initElements(driver,this);
    }
    
    @FindBy(css=".mb-3")
    List<WebElement> products;
    
    @FindBy(css=".ng-animating")
   WebElement Spinner;
    
    
    
    By productsBy=By.cssSelector(".mb-3");
    By cartBy=By.cssSelector(".card-body button:last-of-type");
    By wait =By.cssSelector("#toast-container");
    public List<WebElement>getProductList()
    {
    	WaitForElementToAppear(productsBy);
    	return products;
    }
    
public WebElement getProductNames(String productname) {
	
	WebElement prod=getProductList().stream().filter(product->product.findElement(By.cssSelector("b"))
			.getText().equals(productname)).findFirst().orElse(null);
	return prod;
}
 public void addToCart(String productname ) {
	 WebElement prod=getProductNames(productname);
	 prod.findElement(cartBy).click();
	 WaitForElementToAppear(wait);
	 waitForElementToDisappear(Spinner);
 }


}
    
