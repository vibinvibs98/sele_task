import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hotel_proj {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

 System.setProperty("webdriver.chrome.driver","D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
  
 WebDriver driver=new ChromeDriver();
  driver.manage().window().maximize();
  
   driver.get("https://adactinhotelapp.com/index.php");
   
   driver.findElement(By.name("username")).sendKeys("vibin123");
   
   driver.findElement(By.name("password")).sendKeys("Qazwsx@123");
   
   driver.findElement(By.name("login")).click();
   
   WebElement loc = driver.findElement(By.id("location"));
   Select s=new Select(loc);
   s.selectByIndex(3);
   
   
   WebElement hotels = driver.findElement(By.id("hotels"));
   Select s1=new Select(hotels);
   s1.selectByIndex(2);
  
   WebElement room = driver.findElement(By.id("room_type"));
   Select s2=new Select(room);
   s2.selectByIndex(2);
   
   WebElement nfroom = driver.findElement(By.id("room_nos"));
   Select s3=new Select(nfroom);
   s3.selectByIndex(3);
   
 
  // WebElement date = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
 //  date.sendKeys("18/01/2022");
 
   
   WebElement adult = driver.findElement(By.id("adult_room"));
   Select s4=new Select(adult);
   s4.selectByIndex(3);
   
   
   WebElement child= driver.findElement(By.id("child_room"));
   Select s5=new Select(child);
   s5.selectByIndex(3);
   
   driver.findElement(By.id("Submit")).click();
   
   
   driver.findElement(By.id("radiobutton_0")).click();

   driver.findElement(By.id("continue")).click();
   
   driver.findElement(By.name("first_name")).sendKeys("vibin");
   
   driver.findElement(By.name("last_name")).sendKeys("R");
   driver.findElement(By.name("address")).sendKeys("c-79 idpl colony nandambakkam chennai -600089");
   
   driver.findElement(By.name("cc_num")).sendKeys("6654778933262211");
   
   WebElement credit = driver.findElement(By.name("cc_type"));
   Select s6=new Select(credit);
   s6.selectByIndex(2);
 
   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   WebElement expdate = driver.findElement(By.name("cc_exp_month"));
   Select s7=new Select(expdate);
   s7.selectByIndex(5);
  
   WebElement expyear = driver.findElement(By.name("cc_exp_year"));
   Select s8=new Select(expyear);
   s8.selectByIndex(6);
  
driver.findElement(By.name("cc_cvv")).sendKeys("3426");
   
driver.findElement(By.name("book_now")).click(); 

driver.findElement(By.name("my_itinerary")).click();

TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File des=new File("D:\\workspace\\Sele_task\\imgg\\pic3.png");
FileUtils.copyFile(src, des);
	}

}
