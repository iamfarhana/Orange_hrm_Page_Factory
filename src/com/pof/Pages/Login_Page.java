package com.pof.Pages;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Login_Page {
    WebDriver driver;
    Properties properties;
    public Login_Page(WebDriver driver, Properties properties) {
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

    public void login() {
        userName.sendKeys(properties.getProperty("userName_Input"));
        password.sendKeys(properties.getProperty("password_Input"));
        login.click();
    }
}

	
