package com.SeleniumPageObjects;

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

public class StandAlone {

	public static void main(String[] args) {
		
		String productname="ZARA COAT 3";
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		LandingPage lp = new LandingPage(driver);
		lp.goTo();
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
		driver.close();

	}

}
