package com.SeleniumPageObjects;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class StreamsExample {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		//click on column
		driver.findElement(By.xpath("//tr/th[1]")).click();
		//get the items into a list and get the text of each items
		List<WebElement> elementlist=driver.findElements(By.xpath("//tr/td[1]"));
		List<String> originallist=elementlist.stream().map(s->s.getText()).collect(Collectors.toList());
		List<String> sortedlist =originallist.stream().sorted().collect(Collectors.toList());
		//compare original list to sorted list
		Assert.assertTrue(originallist.equals(sortedlist));

//		List<String>price=elementlist.stream().map(s->s.getText().contains("Rice")).map(s->getPriceVeggie(s)).collect((Collectors.toList()));
//		price.forEach(a->System.out.println(a));
//		
//	}
//
//	private static String getPriceVeggie(WebElement s) {
//		
//		findElement.By.
//		return null;
//	}

	
}}
