package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddRandomQuestion {
	WebDriver driver;

	public AddRandomQuestion(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_numbertoadd")
	WebElement numberOfQues;
	
	@FindBy(id = "id_existingcategory")
	WebElement finalAddButton;


	public WebElement getNumberOfQuiz() {
		return numberOfQues;
	}
	
	public WebElement clickAddRandomQuiz() {
		return finalAddButton;
	}


}
