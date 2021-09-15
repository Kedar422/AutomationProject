package Kedar.automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Badge
{
	@Test
	
	public  void Kedar()
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://test.qualicoach.org/user/view.php?id=103&course=2");
	driver.findElement(By.id("username")).sendKeys("user99");
	driver.findElement(By.id("password")).sendKeys("User@3902");
	driver.findElement(By.id("loginbtn")).click();
	driver.findElement(By.xpath("//*[@id='heading7']/div/ul/li/a")).click();
	driver.findElement(By.xpath("//*[@id='collapse7']/div/ul/li[1]/a")).click();
	driver.findElement(By.xpath("//*[@id='collapse7']/div/ul/li[2]/a")).click();
			
	
	
	

	
	
	}
	
	
	
		
	

}



