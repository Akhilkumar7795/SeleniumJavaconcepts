package com.SeleniumPageObjects;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandle {

	public static void main(String[] args) {


		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		Set <String> windows=driver.getWindowHandles();//to know how many windows are open and get there ids
		Iterator<String> it= windows.iterator();//to pull the windows id's we are using iterator
		String parentid=it.next();
		String childid= it.next();
		driver.switchTo().window(childid);
		//System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailid = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(emailid);
		driver.switchTo().window(parentid);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailid);
		

	}

}
