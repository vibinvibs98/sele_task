import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task4_newfb {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	   
		
		driver.get("https://www.facebook.com/");
		
	
		
	WebElement email=	driver.findElement(By.name("email"));
		email.sendKeys("vibsvib");
	
	WebElement pass=	driver.findElement(By.name("pass"));
		pass.sendKeys("873438466");
		
		WebElement newaccount=	driver.findElement(By.xpath("(//a[@data-testid='open-registration-form-button'])[1]"));
		newaccount.click();
	
		Thread.sleep(3000);
		
		WebElement fn=driver.findElement(By.name("firstname"));
		 fn.sendKeys("vib");

	WebElement ln=driver.findElement(By.name("lastname"));
		ln.sendKeys("R");
		
	WebElement phno=driver.findElement(By.name("reg_email__"));
		phno.sendKeys("996589675");
		
		
		WebElement newpass=driver.findElement(By.name("reg_passwd__"));
		newpass.sendKeys("87478566");
		
		
		WebElement day=driver.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByValue("22");
		
		WebElement month=driver.findElement(By.name("birthday_month"));
		Select s1=new Select(month);
		s1.selectByIndex(10);
		
	WebElement year=driver.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("1999");
		
	WebElement gender=driver.findElement(By.xpath("//label[text()='Male']"));
	gender.click();
	
	WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	   signup.click();
		
	}

}
