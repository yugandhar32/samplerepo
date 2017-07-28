package com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class EnterFromPlace {
	WebDriver driver;
  @Test
  public void testEnterFromPlace() {
	  driver.findElement(By.id("FromTag")).sendKeys("Hyderabad, IN - Rajiv Gandhi International (HYD)");
	  
  }
  @BeforeTest
  public void beforeTest() throws MalformedURLException {
	 driver =new FirefoxDriver();
	 String url="https://www.cleartrip.com/";
	 String remoteUrl="http://10.5.93.125:5566/wd/hub";
	 DesiredCapabilities dc=DesiredCapabilities.firefox();
	 dc.setBrowserName("firefox");
	 dc.setPlatform(Platform.VISTA);
	 driver=new RemoteWebDriver(new URL(remoteUrl),dc);
	 
	 driver.get(url);
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
