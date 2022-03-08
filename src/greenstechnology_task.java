import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class greenstechnology_task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		    
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get(" http://www.greenstechnologys.com/");
		   
		  Actions act=new Actions(driver);
	
		  
		  WebElement web = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		  act.contextClick(web).build().perform();
		  
		  Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_DOWN);
		  r.keyRelease(KeyEvent.VK_DOWN);
		  
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
	
		  
		  
		  WebElement web1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		 web1.click();
		  
		  TakesScreenshot ts=(TakesScreenshot)driver;
		  File src=ts.getScreenshotAs(OutputType.FILE);
		  File des=new File("D:\\workspace\\Sele_task\\imgg\\grns.png");
		  FileUtils.copyFile(src, des);
	}

}
