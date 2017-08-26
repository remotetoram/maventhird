package com.ram;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.junit.Assert;

public class AppTest {

	//@SuppressWarnings("deprecation")
	@Test
	public void Login(){
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\Desktop\\Ram 5.0\\Softwares\\geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true); 
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram\\Desktop\\Ram 5.0\\Softwares\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
		
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.yahoomail.com");

		System.out.println("Running Junit test");
		Assert.assertTrue(driver.findElement(By.name("username")).isDisplayed());
		System.out.println("USERNAME field is shown");
		//assert.asserttrue(driver.findElement(By.name("username")).isDisplayed());
		
		//driver.findElement(By.name("username")).sendKeys("remote");
		
		//driver.findElement(By.id("login-signin")).click();;
		//driver.findElement(By.name("password")).
		driver.close();
		
	}
	
   
}
