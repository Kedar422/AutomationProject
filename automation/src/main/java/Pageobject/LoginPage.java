package Pageobject;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class LoginPage {
		WebDriver driver = null;

		public LoginPage(WebDriver driver) {
			super();
			this.driver = driver;
			 
		}
		
		By userName = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By loginButton = By.xpath("//input[@id='loginbtn']");
		
		public WebElement getUserName() {
			return driver.findElement(userName);
		}
		
		public WebElement getPassword() {
			return driver.findElement(password);
		}
		
		public WebElement getLoginButton() {
			return driver.findElement(loginButton);
		}
	}

		




