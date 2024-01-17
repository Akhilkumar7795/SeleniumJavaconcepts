package com.SeleniumPageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        driver.findElement(By.xpath("//div[@id='draggable']")).click();
        Actions a = new Actions(driver);
        WebElement source= driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target= driver.findElement(By.xpath("//div[@id='droppable']"));
        a.dragAndDrop(source, target).build().perform();
        driver.switchTo().defaultContent();

	}

}
