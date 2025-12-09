package com.pof.Pages;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Employee_list {
	 WebDriver driver;
	    Properties properties;
	    public Employee_list(WebDriver driver, Properties properties) {
	        this.driver = driver;
	        this.properties = properties;
	        PageFactory.initElements(driver, this);
	    }
	    @FindBy(xpath = "//input[@name='username']")
	    WebElement userName;

	    @FindBy(xpath = "//input[@name='password']")
	    WebElement password;

	    @FindBy(xpath = "//button[@type='submit']")
	    WebElement login;
}
