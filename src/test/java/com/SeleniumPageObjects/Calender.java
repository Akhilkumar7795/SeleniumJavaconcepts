package com.SeleniumPageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender {

	public static void main(String[] args) throws InterruptedException {


		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();
		while(!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		List<WebElement> dates=driver.findElements(By.cssSelector(".flatpickr-day "));
		int count=driver.findElements(By.cssSelector(".flatpickr-day ")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
				break;
			}
		}
		

	}

}
