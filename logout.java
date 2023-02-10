package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logout {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\project\\logout.properties");
	       prop.load(ip);
	       driver.get(prop.getProperty("url"));
	       WebElement username=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	       username.sendKeys("Admin");
	       WebElement password=driver.findElement(By.name("password"));
	       password.sendKeys("admin123");
	       WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	       login.click();
		 WebElement logout=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
	     logout.click();
	}
}