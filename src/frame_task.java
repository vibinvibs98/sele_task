import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_task {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Frames.html");
	
	  WebElement multi = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	   multi.click();
	
	  driver.switchTo().frame(1);
	  driver.switchTo().frame(0);
	  
	  
		WebElement  txt= driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txt.sendKeys("welcome");
	}

}
