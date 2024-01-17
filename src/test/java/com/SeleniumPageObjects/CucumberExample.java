package com.SeleniumPageObjects;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CucumberExample {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot","Tomato"};
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulsheetyacademy");
		driver.findElement(By.cssSelector(".promoBtn")).click();
		//WebDriverWait w = new WebDriverWait(driver,5);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
		System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
		}
		public static  void addItems(WebDriver driver,String[] itemsNeeded)
		{
		  int j=0;
		 List<WebElement> products =driver.findElements(By.cssSelector("h4.product-name"));
		 for(int i=0;i<products.size();i++)
		 {
			 String[] name=products.get(i).getText().split("-");
			 String formattedName =name[0].trim();
			 List itemsNeededList = Arrays.asList(itemsNeeded);
			 if(itemsNeededList.contains(formattedName))
			 {
				 j++;
				 driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				 if(j==itemsNeeded.length)

				 {

				 break;

				 }
			 }
		 }

	}

}
