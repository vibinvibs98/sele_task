import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hdfc2_bank {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame(0);
		WebElement log = driver.findElement(By.name("fldLoginUserId"));
		log.sendKeys("vib3345");
		
	
		WebElement cont = driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']"));
		cont.click();
		
		WebElement pass = driver.findElement(By.name("fldPassword"));
		pass.sendKeys("qazwsxedc");
		
		WebElement login = driver.findElement(By.xpath("//a[@onclick='return fLogon();']"));
		  login.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}
 
}
