package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassExample {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ziaha\\git\\NewTourDemo\\NewToursDemo\\src\\test\\resources\\driver\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 		
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.com/");
	    Actions action = new Actions(driver);
	    WebElement signInMenu = driver.findElement(By.xpath("(//a[@class='nav-a nav-a-2'])[1]"));
	    action.moveToElement(signInMenu);
	    WebElement signInButton = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
	    action.moveToElement(signInButton);
	    action.click().build();
	        

	}

}
