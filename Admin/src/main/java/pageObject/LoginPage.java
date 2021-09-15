package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	WebElement userName;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(id = "loginbtn")
	WebElement login;

	public WebElement getUsername() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement loginBtn() {
		return login;
	}

}
