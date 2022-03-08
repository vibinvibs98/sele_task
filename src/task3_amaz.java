import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task3_amaz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Sele_task\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_7b63n4zle7_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294135909760&hvpos=&hvnetw=g&hvrand=11237318882542746357&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061916&hvtargid=kwd-298479560553&hydadcr=5840_1914861&gclid=Cj0KCQiAqvaNBhDLARIsAH1Pq525jXh0X9rbr7wvR6l3FXJGguIq1j8kfGk3aLdzTT-_1P0JeNrQSXsaAkFOEALw_wcB");
		
		WebElement amz=driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		amz.sendKeys("electronics");
	}

}
