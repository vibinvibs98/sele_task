import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
  
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    
  WebElement fb=  driver.findElement(By.xpath("//div[contains(text(),'or')]"));
System.out.println(fb.getText());
	}

}
