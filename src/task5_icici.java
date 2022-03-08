import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task5_icici {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	   Thread.sleep(500);
		
		WebElement name=driver.findElement(By.name("DUMMY1"));
		name.sendKeys("vibinvibs"); 
		
	WebElement userid=driver.findElement(By.xpath("(//a[text()='Get User ID'])[1]"));
		userid.click();
		
		WebElement arrow = driver.findElement(By.xpath("//img[@onclick='goUserId();']"));
		arrow.click();
		
	WebElement pass=driver.findElement(By.xpath("(//input[@size='28'])[4]"));
		pass.sendKeys("6478544");		
		
		
		
	//WebElement log=driver.findElement(By.xpath(""));
	//	log.click();
		
	}

}
