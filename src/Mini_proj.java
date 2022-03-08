import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","D:\\workspace\\Selenim\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");	
		
		WebElement signin = driver.findElement(By.xpath("//a[normalize-space()='Sign in']"));
		signin.click();
		
		WebElement email = driver.findElement(By.name("email_create"));
		email.sendKeys("henriq123@gmail.com");
		
		WebElement account = driver.findElement(By.xpath("//span[normalize-space()='Create an account']"));
		account.click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement title = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		title.click();
		
		WebElement fname = driver.findElement(By.name("customer_firstname"));
		fname.sendKeys("vib");
		
		WebElement lname = driver.findElement(By.name("customer_lastname"));
		lname.sendKeys("R");
		
		WebElement pswd = driver.findElement(By.id("passwd"));
		pswd.sendKeys("h2134");
		
		WebElement days = driver.findElement(By.id("days"));
		Select s=new Select(days);
		s.selectByIndex(7);
		
		WebElement month = driver.findElement(By.id("months"));
	    Select s1=new Select(month);
	    s1.selectByIndex(8);
	
		
		WebElement year = driver.findElement(By.id("years"));
	    Select s2=new Select(year);
	    s2.selectByValue("2008");
	
	    WebElement news = driver.findElement(By.name("newsletter"));
	    news.click();
	    

	    WebElement partners = driver.findElement(By.name("optin"));
	    partners.click();
	    
	    WebElement company = driver.findElement(By.id("company"));
	    company.sendKeys("wipro");
	    
	    WebElement address = driver.findElement(By.id("address1"));
	    address.sendKeys("idpl colony");
	    
	    WebElement city = driver.findElement(By.name("city"));
	    city.sendKeys("chennai");
	    
	    WebElement state = driver.findElement(By.id("id_state"));
	    Select s3=new Select(state);
	    s3.selectByValue("32");
	    
	    WebElement pincode = driver.findElement(By.id("postcode"));
	    pincode.sendKeys("00000");
	    
	    WebElement phone = driver.findElement(By.id("phone_mobile"));
	    phone.sendKeys("994376845");
	    
	    WebElement future = driver.findElement(By.name("alias"));
	    future.sendKeys("nandambakkam");
	   
	    WebElement reg = driver.findElement(By.name("submitAccount"));
	    reg.click();
	}

}
