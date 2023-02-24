package project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createuser {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\shubh\\eclipse-workspace\\Exclerselenium\\src\\test\\java\\project\\createuser");
		 prop.load(ip);
	       driver.get(prop.getProperty("url"));
	       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	       
	    WebElement username=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	       username.sendKeys(prop.getProperty("name"));
	       WebElement password=driver.findElement(By.name("password"));
	       password.sendKeys(prop.getProperty("pass"));
	       WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	       login.click();
	      // driver.manage().window().maximize();
           WebElement admin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
	       admin.click();
	       WebElement add=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		      add.click();
		      
		    //  List<WebElement> options= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div"));  
		      //for (WebElement element:options)
		      //{  
		        //   if(element.getText().equals("ESS")){  

		          //    element.click();
		          //}
		          //}
			    
		    //  WebElement userole=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]"));
		      //userole.sendKeys(prop.getProperty("userole"));
		     //WebElement ESS=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		      //ESS.click();
		      
		      WebElement ename=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		       ename.sendKeys(prop.getProperty("ename"));
		       WebElement status=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
			      status.click();
			      WebElement enabled=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
			      enabled.click();
			  Select userole=new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]"))) ;   
			    userole.selectByVisibleText("ESS");
			      
			      
			    
}


		
	}

