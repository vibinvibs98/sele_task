import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_toelementask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		Actions act=new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'might')][1]"));
		
		act.moveToElement(ele).build().perform();
		
	}

}
