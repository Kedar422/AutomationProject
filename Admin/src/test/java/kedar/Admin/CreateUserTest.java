package kedar.Admin;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kdr.Admin.BaseClass;
import kdr.Admin.Login;
import pageObject.AddNewUserPage;
import pageObject.SearchPage;
import pageObject.UsersPage;

public class CreateUserTest extends BaseClass {
	@BeforeTest
	public void launchBrowser() {
		driver = initializeDriver();
		driver.get(prop.getProperty("adminUrl"));
	}

	@Test
	public static void adminLogin() {
		String username = prop.getProperty("adminUsername");
		String password = prop.getProperty("adminPswd");
		Login.loginCredentials(username, password);
	}

	@Test
	public void createUser() {
		SearchPage searchPage = new SearchPage(driver);

		searchPage.userTab().click();
		UsersPage usersPage = new UsersPage(driver);
		usersPage.addNewUser().click();
		AddNewUserPage addNewUser = new AddNewUserPage(driver);
		addNewUser.getUsername().sendKeys(prop.getProperty("username"));
		addNewUser.clickOnPswd().click();
		addNewUser.getPassword().sendKeys(prop.getProperty("password"));
		addNewUser.getFname().sendKeys(prop.getProperty("fname"));
		addNewUser.getLname().sendKeys(prop.getProperty("lname"));
		addNewUser.getEmail().sendKeys(prop.getProperty("email"));
		scrollBy(566, 1553);
		addNewUser.submitButton().click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
