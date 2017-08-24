package com.ram;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppTest {
	@Test
	public void Login(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Ram\\Desktop\\Ram 5.0\\Softwares\\geckodriver.exe");
		//DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		//capabilities.setCapability("marionette", true); 
		
		
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.yahoomail.com");
		driver.findElement(By.id("login-signin")).click();;
	}
   
}
