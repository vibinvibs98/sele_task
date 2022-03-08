import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class icici2_task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
 
System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
	
		WebElement username = driver.findElement(By.name("DUMMY1"));
	    username.sendKeys("vibs123");
		
	    WebElement pswrd = driver.findElement(By.name("AuthenticationFG.ACCESS_CODE"));
	    pswrd.sendKeys("qazwsxedc");
	    
	   
	}

}
