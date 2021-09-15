package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewCategory {
	WebDriver driver;

	public AddNewCategory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_parent")
	WebElement parentCategory;
	@FindBy(id = "id_name")
	WebElement categoryName;
	@FindBy(id = "id_idnumber")
	WebElement categoryId;
	@FindBy(id = "id_submitbutton")
	WebElement Submit;

	public WebElement selectParentCategory() {
		return parentCategory;
	}

	public WebElement getCategoryName() {
		return categoryName;
	}
	public WebElement getCategoryId() {
		return categoryId;
	}

	public WebElement createCategory() {
		return Submit;
	}

}
