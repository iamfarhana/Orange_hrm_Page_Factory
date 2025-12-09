package com.pof.main;
import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pof.Pages.Add_Employee;
import com.pof.Pages.Dashboard_Page;
import com.pof.Pages.Login_Page;
import com.pof.Pages.PIM_Page;
public class Base_Page {
	static WebDriver driver;
	public static void main(String[] args) {
try {
	 driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
FileInputStream File=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\OrangeHRM\\src\\inputs\\input_properties");
Properties properties= new Properties();
properties.load(File);
String url = properties.getProperty("URL");
driver.get(url);

Login_Page log= new Login_Page(driver, properties);
log.login();
Thread.sleep(2000);
System.out.println("✅ Login successful!");

Dashboard_Page dashboard = new Dashboard_Page(driver);
dashboard.clickPIM();
System.out.println("PIM Page opened!");

PIM_Page addemployee= new PIM_Page(driver);
addemployee.Clickaddemployee();
System.out.println("clicked on add employee!");

Add_Employee add_details=new Add_Employee(driver,properties);
add_details.save();
System.out.println("Employee detailes are saved.");
}catch(Exception e) {
	
}
	}

}
