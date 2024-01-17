package com.SeleniumPageObjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException {


		ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
       TakesScreenshot ts = (TakesScreenshot)driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       File destfile = new File("C:\\DOC/SREENSHOT/GOOGLE.png");
       Files.copy(src, destfile);
	}

}
