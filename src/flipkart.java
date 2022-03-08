import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
    
  WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get("https://www.amazon.com/s?k=iphone7&crid=1DYVPXHQCMCWT&sprefix=iphone%2Caps%2C572&ref=nb_sb_noss_2");
  
  Actions act=new Actions(driver);
  WebElement phone = driver.findElement(By.xpath("//a[normalize-space()='iPhone X']"));
  phone.click();

  WebElement cart = driver.findElement(By.xpath("//a[text()=' Add to List ']"));
  cart.click();
    
	
	
	}

}
