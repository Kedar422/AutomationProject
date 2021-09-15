package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCourse {
	WebDriver driver;

	public AddNewCourse(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_fullname")
	WebElement fullName;
	@FindBy(id = "id_shortname")
	WebElement shortName;
	@FindBy(xpath = "//a[text()='Course format']")
	WebElement courseFormate;
	@FindBy(id = "id_format")
	WebElement selectFormate;
	@FindBy(id = "id_activitytype")
	WebElement selectActivityType;
	@FindBy(id = "id_saveanddisplay")
	WebElement saveAndDisplay;

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getShortName() {
		return shortName;
	}

	public WebElement courseFormate() {
		return courseFormate;
	}

	public WebElement selectFormate() {
		return selectFormate;
	}

	public WebElement selectActivityType() {
		return selectActivityType;
	}

	public WebElement saveAndDisplayBtn() {
		return saveAndDisplay;
	}

}
