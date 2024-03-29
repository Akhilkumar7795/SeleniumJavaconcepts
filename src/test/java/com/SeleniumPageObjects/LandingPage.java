package com.SeleniumPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AsbstarctComponents {

         WebDriver driver;
         public LandingPage(WebDriver driver)
         {
        	 super(driver);
        	 this.driver=driver;
        	 PageFactory.initElements(driver,this);
         }
         
         @FindBy(id="userEmail")
         WebElement username;
         
         @FindBy(id="userPassword")
         WebElement userpass;
         
         @FindBy(id="login")
         WebElement login;
         
         public ProductCatalogue loginApplication(String email,String password )
         {
        	 username.sendKeys(email);
        	 userpass.sendKeys(password);
        	 login.click();
        	 ProductCatalogue pc = new ProductCatalogue(driver);
        	 return pc;
         }
         
         public void goTo() {
        	 driver.get("https://rahulshettyacademy.com/client");
         }

	}

	

