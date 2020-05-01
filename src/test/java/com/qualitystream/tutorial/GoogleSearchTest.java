package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	private WebDriver driver; 
	
	@Before 
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver3/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	
	@Test 
	public void TestGooglePage() {
		
		WebElement searchbox = driver.findElement(By.name("q")); 
		
		searchbox.clear();
		searchbox.sendKeys("quality-stream Introducción a la Automatización");
		searchbox.submit();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		assertEquals("quality-stream Introducción a la Automatización - Buscar con Google", driver.getTitle()); 
		
	}
	
	@After 
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
