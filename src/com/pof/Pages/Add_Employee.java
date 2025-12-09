package com.pof.Pages;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Add_Employee {
	 WebDriver driver;
	 Properties properties;
	 public Add_Employee(WebDriver driver, Properties properties) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	 @FindBy(xpath = "//input[@name='firstName']")
	    WebElement Firstname;

	    @FindBy(xpath = "//input[@name='middleName']")
	    WebElement Middlename;

	    @FindBy(xpath = "//input[@name='lastName']")
	    WebElement Lastname; 
	    
	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement save; 
	 
	    public void save() {
	    	Firstname.sendKeys(properties.getProperty("Firstname_Input"));
	    	Middlename.sendKeys(properties.getProperty("Middlename_Input"));
	    	Lastname.sendKeys(properties.getProperty("Lastname_Input"));
	         save.click();
	   }
}

