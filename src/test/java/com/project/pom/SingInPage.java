package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends Base {
	
	By userLocator = By.name("userName"); 
	
	By passLocator = By.name("password"); 
	
	By signInBtnLocator = By.name("login"); 
	
	By homePageLocator = By.xpath("//img[@src=\"/images/masts/mast_flightfinder.gif\"]");
	

	public SingInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void signIn() {
		
		if (isDisplayed(userLocator)) {
			type("yannycarol@gmail.com", userLocator); 
			type("Carolina123*", passLocator);
			
			click(signInBtnLocator); 
			
		} else {
			System.out.println("username text was not present");
		}
		
	}
	
	
	public boolean isHomePageDisplayed() {
		return isDisplayed(homePageLocator); 
	}

}
