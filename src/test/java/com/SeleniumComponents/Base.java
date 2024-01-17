package com.SeleniumComponents;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.SeleniumPageObjects.LandingPage;

public class Base {

	public WebDriver driver;
	public LandingPage lp;
	public WebDriver initiliazrDriver() throws IOException {
	
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"src\\main\\java\\com\\Resources\\GlobalData.properties");
		prop.load(fis);
		String browsername =prop.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome")){
			ChromeOptions options = new ChromeOptions();
	        options.addArguments("--remote-allow-origins=*");
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver(options);
			driver.manage().window().maximize();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			//firefox code
		}
		else if(browsername.equalsIgnoreCase("edge")) {
			//edge code
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	@BeforeMethod
	public LandingPage launchApplication() throws IOException {
		
		 driver =initiliazrDriver();
		 lp = new LandingPage(driver);
		lp.goTo();
		return lp;
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
