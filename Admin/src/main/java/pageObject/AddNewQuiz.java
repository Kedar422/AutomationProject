package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewQuiz {
	WebDriver driver;

	public AddNewQuiz(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_name")
	WebElement quizName;

	@FindBy(id = "id_submitbutton")
	WebElement submit;


	public WebElement getQuizName() {
		return quizName;
	}
	public WebElement submitQuiz() {
		return submit;
	}
}
