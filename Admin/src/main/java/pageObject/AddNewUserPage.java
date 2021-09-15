package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewUserPage {
	WebDriver driver;

	public AddNewUserPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	WebElement usename;
	@FindBy(xpath = "//em[text()='Click to enter text']")
	WebElement passwordclick;
	@FindBy(id = "id_newpassword")
	WebElement password;
	@FindBy(id = "id_firstname")
	WebElement fname;
	@FindBy(id = "id_lastname")
	WebElement lname;
	@FindBy(id = "id_email")
	WebElement email;
	@FindBy(id = "id_submitbutton")
	WebElement submit;
	
	public WebElement getUsername() {
		return usename;
	}
	public WebElement clickOnPswd() {
		return passwordclick;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement submitButton() {
		return submit;
	}

}
