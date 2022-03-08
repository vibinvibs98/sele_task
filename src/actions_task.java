import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		
		Actions act=new Actions(driver);
		
		 WebElement dbl = driver.findElement(By.id("doubleClickBtn"));
		 
		 act.doubleClick(dbl).build().perform();
		 
		 
		 WebElement clic = driver.findElement(By.xpath("//button[text()='Click Me']"));
		 
		  act.click(clic).build().perform();
	}

}
