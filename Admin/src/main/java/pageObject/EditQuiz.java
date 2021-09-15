package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditQuiz {
	WebDriver driver;

	public EditQuiz(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='singlebutton']//input[@value='Edit quiz']")
	WebElement editQuiz;
	
	@FindBy(xpath = "//span[text()='Add']/parent::a")
	WebElement addQuiz;
	
	@FindBy(xpath = "//span[text()='a random question']/parent::a")
	WebElement addRandomQuiz;


	public WebElement clickEditQuiz() {
		return editQuiz;
	}
	
	public WebElement clickAddQuiz() {
		return addQuiz;
	}
	
	public WebElement clickRandomQuiz() {
		return addRandomQuiz;
	}

	
	
}
