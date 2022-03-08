import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class hdfc_task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.switchTo().frame(0);
	  WebElement con= driver.findElement(By.xpath("//a[text()='CONTINUE']"));
	con.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	}

}
