package project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maintainance {
	@Test public void login() throws IOException, InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\project\\maintainance");
		 prop.load(ip);
	       driver.get(prop.getProperty("url"));
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	       driver.findElement(By.xpath(prop.getProperty("chrome.login.username.xpath"))).
	       sendKeys(prop.getProperty("name"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.login.password.xpath"))).
	       sendKeys(prop.getProperty("pass"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.login.login.xpath"))).click();
	     
	       driver.findElement(By.xpath(prop.getProperty("chrome.maintain.xpath"))).click();
	       driver.findElement(By.xpath(prop.getProperty("chrome.password.xpath"))).
	       sendKeys(prop.getProperty("pass"));
	       driver.findElement(By.xpath(prop.getProperty("chrome.confirm.xpath"))).click();
}
}
