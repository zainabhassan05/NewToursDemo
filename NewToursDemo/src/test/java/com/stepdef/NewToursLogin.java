package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLogin {
	
	WebDriver driver; 
	
	@Given("User is on New Tours website")
	public void user_is_on_New_Tours_website() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uddin\\git\\NewToursDemo\\NewToursDemo\\src\\test\\resources\\driver\\chromedriver.exe"); 
	    driver = new ChromeDriver(); 
	    driver.manage().window().maximize();
	    driver.get("http://www.newtours.demoaut.com/");
	}

	@When("User enters username")
	public void user_enters_username() {
	    driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("selenium1994");
	    
	}

	@When("User enters password")
	public void user_enters_password() {
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("smarttech");
	    
	}

	@When("User clicks sign in")
	public void user_clicks_sign_in() {
	    driver.findElement(By.xpath("//*[@name='login']")).click();
	    
	}

	@Then("User is signed in")
	public void user_is_signed_in() {
	    Assert.assertEquals(driver.getTitle(), "Find a Flight: Mercury Tours:");
	    
	}

}
