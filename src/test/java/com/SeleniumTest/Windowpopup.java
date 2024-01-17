package com.SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Windowpopup {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("Basic Auth")).click();

		
	}

}
