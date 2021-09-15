package Pageobject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class DashBoardPage {
		WebDriver driver = null;

		public DashBoardPage(WebDriver driver) {
			super();
			this.driver = driver;
		}
		
		By userPhoto = By.xpath("//span/img[@class='userpicture defaultuserpic']");
		By profile = By.xpath("//*[@id='actionmenuaction-2']");
		
		public WebElement getUserPhoto() {
			return driver.findElement(userPhoto);
		}
		
		
		public WebElement getProfileOption() {
			return driver.findElement(profile);
		}
	}





