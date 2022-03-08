import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tsk_1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		 
		 
		  WebDriver driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.messenger.com/");
				  
	WebElement mes=driver.findElement(By.id("email"));
		  mes.sendKeys("vibinvibs@gmail");
		  
		  WebElement pass=driver.findElement(By.id("pass"));
		  pass.sendKeys("vibs223434");
		  
          Thread.sleep(5000);
		  WebElement log=driver.findElement(By.name("login"));
		  log.click();
		  
	}

}
