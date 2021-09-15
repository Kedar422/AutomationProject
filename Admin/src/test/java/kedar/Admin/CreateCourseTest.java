package kedar.Admin;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import kdr.Admin.BaseClass;
import pageObject.AddNewCategory;
import pageObject.AddNewCourse;
import pageObject.AddNewQuiz;
import pageObject.AddRandomQuestion;
import pageObject.CourseCategoryManagement;
import pageObject.CoursePage;
import pageObject.EditQuiz;
import pageObject.ErrorMessagePage;
import pageObject.HomePage;
import pageObject.SearchPage;

public class CreateCourseTest extends BaseClass {
	public static SearchPage searchPage;
	public static CourseCategoryManagement ccm;
	public static CoursePage coursePage;
	public static AddNewCategory addNewCategory;
	public static Select dropDown;
	public static AddNewCourse addNewCourse;
	public static ErrorMessagePage errorMessagePage;
	public static AddNewQuiz addNewQuiz;
	public static EditQuiz editQuiz;
	public static AddRandomQuestion addRandomQuestion;
	public static HomePage homePage;

	@BeforeTest
	public void launchBrowser() {
		driver = initializeDriver();
		driver.get(prop.getProperty("adminUrl"));
	}

	@Test(priority = 1)
	public void checkLogin() {
		String actulTitle = driver.getTitle();
		String expectedTitle = "Qualicoach: Log in to the site";
		if (actulTitle.equalsIgnoreCase(expectedTitle)) {
			CreateUserTest.adminLogin();
		}
	}

	@Test(priority = 2)
	public void createCourse() {

		courses();
		manageCourseAndCategories();
		newCategory();
		createCategory();
		createNewCourse();
		errorMessage();
		courses();
		manageCourseAndCategories();
		searchCourse();
		addNewQuiz();

	}

	public static void courses() {
		searchPage = new SearchPage(driver);
		searchPage.courseTab().click();
	}

	public static void manageCourseAndCategories() {
		coursePage = new CoursePage(driver);
		coursePage.manageCourseCategory().click();
	}

	public static void newCategory() {
		ccm = new CourseCategoryManagement(driver);
		ccm.createNewCategory().click();
	}

	public static void createCategory() {
		addNewCategory = new AddNewCategory(driver);
		dropDown = new Select(addNewCategory.selectParentCategory());
		dropDown.selectByIndex(1);
		addNewCategory.getCategoryName().sendKeys(prop.getProperty("categoryName"));
		addNewCategory.getCategoryId().sendKeys(prop.getProperty("categoryId"));
		scrollBy(0, 500);
		addNewCategory.createCategory().click();
	}

	public static void createNewCourse() {
		ccm.getCategoryName().click();
		ccm.createNewCourse().click();
		addNewCourse = new AddNewCourse(driver);
		addNewCourse.getFullName().sendKeys(prop.getProperty("fullName"));
		addNewCourse.getShortName().sendKeys(prop.getProperty("shortName"));
		addNewCourse.courseFormate().click();
		dropDown = new Select(addNewCourse.selectFormate());
		dropDown.selectByVisibleText("Single activity format");
		dropDown = new Select(addNewCourse.selectActivityType());
		dropDown.selectByVisibleText("Quiz");
		addNewCourse.saveAndDisplayBtn().click();
	}

	public static void errorMessage() {
		if (driver.getTitle().equalsIgnoreCase("Error")) {
			errorMessagePage = new ErrorMessagePage(driver);
			errorMessagePage.continueBtn().click();
			homePage = new HomePage(driver);
			homePage.imageIcon().click();
			homePage.dashboard().click();
			homePage.search().click();
		}
	}

	public static void searchCourse() {
		String ctid = prop.getProperty("categoryId");
		String ctname = prop.getProperty("categoryName");
		String actualCategoryId = ccm.getCategoryId().getText();
		String actualCtName = ccm.getCategoryName().getText();
		if (ctid.equals(actualCategoryId) && ctname.equals(actualCtName)) {
			ccm.getCategoryName().click();
		}

		ccm.getCourseName().click();
		scrollBy(0, 700);
		ccm.editCourse().click();
		addNewCourse.saveAndDisplayBtn().click();
	}

	public static void addNewQuiz() {
		addNewQuiz = new AddNewQuiz(driver);
		addNewQuiz.getQuizName().sendKeys(prop.getProperty("quizName"));
		addNewQuiz.submitQuiz().click();
		editQuiz = new EditQuiz(driver);
		editQuiz.clickEditQuiz().click();
		editQuiz.clickAddQuiz().click();
		editQuiz.clickRandomQuiz().click();
		addRandomQuestion = new AddRandomQuestion(driver);
		dropDown = new Select(addRandomQuestion.getNumberOfQuiz());
		dropDown.selectByValue("4");
		addRandomQuestion.clickAddRandomQuiz().click();

	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
