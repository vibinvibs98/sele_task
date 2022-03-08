import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class atm_task {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		
		Thread.sleep(2000);
		WebElement con = driver.findElement(By.xpath("//img[@alt='user']"));
		  con.click();
		  
		  
	}

}
