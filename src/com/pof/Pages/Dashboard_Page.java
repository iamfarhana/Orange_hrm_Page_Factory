package com.pof.Pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class Dashboard_Page {
	    WebDriver driver;
	    public Dashboard_Page(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    @FindBy(xpath = "//span[text()='PIM']")
	    WebElement pimMenu;

	public void clickPIM() {
		pimMenu.click();
	}

}
