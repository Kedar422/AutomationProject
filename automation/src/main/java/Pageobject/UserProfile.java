package Pageobject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class UserProfile {
		
		WebDriver driver=null;

		public UserProfile(WebDriver driver) {
			super();
			this.driver = driver;
		}
		
		By editProfile= By.xpath("//a[contains(text(),'Edit profile')]");
		
		public WebElement getEditProfile() {
			return driver.findElement(editProfile);
		}
	}




