package com.pof.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class PIM_Page {
	 WebDriver driver;
	 public PIM_Page(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	   @FindBy(linkText = "Add Employee")
	    WebElement addemployee;
	   public void Clickaddemployee() {
			addemployee.click();
	   }
}

