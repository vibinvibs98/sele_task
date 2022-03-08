import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	//     driver.get("https://www.facebook.com/");
	     
	////     String fb=driver.getTitle();
		//	System.out.println(fb);
	  //   driver.navigate().forward();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		String insta=driver.getTitle();
		System.out.println(insta);
		Thread.sleep(500);
		
  WebElement  email= driver.findElement(By.xpath("//input[@type='text']"));
	 email.sendKeys("vibsvib");
	 
	  WebElement  pass= driver.findElement(By.xpath("//input[@type='password']"));
		 pass.sendKeys("75674387457");
		 
		WebElement log= driver.findElement(By.xpath("//div[text()='Log In']"));
	 log.click();
	 
	 TakesScreenshot s=(TakesScreenshot)driver;
	File source=s.getScreenshotAs(OutputType.FILE);
	 File destination=new File("D:\\workspace\\Sele_task\\imgg\\snaps.png");
	 FileUtils.copyFile(source, destination);
	 
	}

}
