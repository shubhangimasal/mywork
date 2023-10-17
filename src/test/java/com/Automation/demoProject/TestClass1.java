package com.Automation.demoProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;




public class TestClass1 {

	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver()  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Shubhangi\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void Test1() throws InterruptedException {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is "+driver.getTitle());
		WebElement closeButton =driver.findElement(By.cssSelector(".hustle-button-icon.hustle-button-close"));
		closeButton.click();
	}
	
	@Test
	public void Test2() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is "+driver.getTitle());
		WebElement closeButton =driver.findElement(By.cssSelector(".hustle-button-icon.hustle-button-close"));
		closeButton.click();
	}
	
	@Test
	public void Test3() {
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 title is "+driver.getTitle());
		WebElement closeButton =driver.findElement(By.cssSelector(".hustle-button-icon.hustle-button-close"));
		closeButton.click();
	Assert.assertEquals("AutomationTalks - Learn Automation Testing", driver.getTitle());
	}
	
	
	
	@AfterMethod
	public void quit()  {
		driver.close();
		
	
	
	}


}
