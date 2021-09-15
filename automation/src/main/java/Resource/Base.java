package Resource;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Base {
		
		
		public WebDriver driver=null;
		
		public WebDriver initializeDriver()  {
			
			System.setProperty("webdriver.chrome.driver","C://chromedriver.exe" );
			driver =new ChromeDriver();
			return driver;
		}
	}


		




