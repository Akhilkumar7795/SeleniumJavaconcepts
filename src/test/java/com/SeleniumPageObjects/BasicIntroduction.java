package com.SeleniumPageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasicIntroduction {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Akhil");
		driver.findElement(By.name("inputPassword")).sendKeys("kumar");
		driver.findElement(By.className("signInBtn")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akhil");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Akhil");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("Akhil"); 
		driver.findElement(By.xpath("//div/button[2]")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		
		
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		
	}

}
