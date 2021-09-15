package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import kdr.Admin.BaseClass;

public class HomePage extends BaseClass {
	
	WebDriver driver;
	String dammycname = prop.getProperty("Selenium Intermediate");

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@class='userpicture defaultuserpic']")
	WebElement imageIcon;
	@FindBy(linkText = "Dashboard")
	WebElement dashboard;
	@FindBy(linkText = "Profile")
	WebElement profileLink;
	@FindBy(xpath = "//div[@class='course_element_item active']")
	List<WebElement> courses;
	
	@FindBy(xpath = "//li[@class = 'dashboard_tabs']//i[@class = 'administration']")
	WebElement search;

	public WebElement imageIcon() {
		return imageIcon;
	}
	
	public List<WebElement> getcourseList() {
		return courses;
	}

	public WebElement dashboard() {
		return dashboard;
	}

	public WebElement search() {
		return search;
	}

}
