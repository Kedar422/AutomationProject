package Pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StudentHomePage {
	WebDriver driver;

	public StudentHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span/img[@class='userpicture defaultuserpic']")
	WebElement photoStudent;
	
	@FindBy(xpath = "//span[@class='menu-action-text' and text()='Profile']")
	WebElement profileStudent;
	
	@FindBy(xpath = "//button[div[text()='Tester3']]")
	WebElement findCourseStudent;
	
	@FindBy(xpath = "//div[a[p[text()='TestCourse3']]]")
	WebElement selectCourseStudent;
	
	@FindBy(xpath = "//a[p[text()='TestCourse3']]")
	WebElement selectHoveredCourse;
	
	@FindBy(id = "id_submitbutton")
	WebElement enrollCourseStudent;
	
	public WebElement getPhotoStudent() {
		return photoStudent;
	}
	
	public WebElement getProfileStudent() {
		return profileStudent;
	}
	
	public WebElement findCourse() {
		return findCourseStudent;
	}

	public WebElement selectCourse() {
		return selectCourseStudent;
	}
	
	public WebElement selectHoveredCourseStudent() {
		return selectHoveredCourse;
	}
	
	public WebElement enrollCourseButton() {
		return enrollCourseStudent;
	}
}


