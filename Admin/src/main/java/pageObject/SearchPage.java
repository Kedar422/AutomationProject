package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Users']")
	WebElement userTab;
	@FindBy(xpath = "//a[@role='tab'][text()='Courses']")
	WebElement courseTab;

	public WebElement userTab() {
		return userTab;
	}

	public WebElement courseTab() {
		return courseTab;
	}
}
