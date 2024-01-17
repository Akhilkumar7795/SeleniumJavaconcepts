package com.SeleniumTest;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SeleniumComponents.Base;
import com.SeleniumPageObjects.CartPage;
import com.SeleniumPageObjects.CheckOut;
import com.SeleniumPageObjects.Conformationpage;
import com.SeleniumPageObjects.LandingPage;
import com.SeleniumPageObjects.ProductCatalogue;

public class StandAlone extends Base {

	@Test
	public void standAlone() throws IOException {
		
		String productname="ZARA COAT 3";
		ProductCatalogue pc =lp.loginApplication("akhilsallapalli22@gmail.com", "Akhil@123");
		List<WebElement> products=pc.getProductList();
		pc.addToCart(productname); 
		CartPage cp = pc.cartClick();
		Boolean match = cp.verifyProductDisplay(productname);
		Assert.assertTrue(match);
		CheckOut c=cp.checkItemsOut();
		c.selectcountry("india");
		Conformationpage cmp=c.submitOrder();
		String conformmessage=cmp.getmainpageText();
		Assert.assertTrue(conformmessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	}
   @Test(dependsOnMethods={"standAlone"})
	public void orderHistoryTest() {
	   ProductCatalogue pc =lp.loginApplication("akhilsallapalli22@gmail.com", "Akhil@123");
	   
	}
}
