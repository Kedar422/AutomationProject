package Kedar.automation;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import Pageobject.DashBoardPage;
import Pageobject.EditProfile;
import Pageobject.LoginPage;
import Pageobject.UserProfile;
import Resource.Base;


	public class UserUpdateProfile extends Base {
		WebDriver driver = null;

		@BeforeTest
		public void testLogin() {
			driver = initializeDriver();
		}

		
		
		

		@Test
		public void EditUserProfileGeneral() {
			
			driver.get("https://test.qualicoach.org/my/");

			// login page
			LoginPage login = new LoginPage(driver);
			login.getUserName().sendKeys("user101");
			login.getPassword().sendKeys("User@6177");
			login.getLoginButton().click();

			// click on user picture
			DashBoardPage dashboard = new DashBoardPage(driver);
			dashboard.getUserPhoto().click();

			// click on profile option
			dashboard.getProfileOption().click();

			// click on edit Profile
			UserProfile userProf = new UserProfile(driver);
			userProf.getEditProfile().click();

			// Edit the User Profile

			EditProfile editProfile = new EditProfile(driver);
			editProfile.getFirstName().clear();
			editProfile.getFirstName().sendKeys("TEST1");
			editProfile.getLastName().clear();
			editProfile.getLastName().sendKeys("USER1");
			Select Email_display_DD = new Select(editProfile.getMailDisplay());
			Email_display_DD.selectByIndex(1);
			editProfile.getCityOrTown().clear();
			editProfile.getCityOrTown().sendKeys("Attibele");
			Select countryDropdown = new Select(editProfile.getcountryDropDown());
			countryDropdown.selectByValue("IN");
			Select TimeZone_DD = new Select(editProfile.getTimeZone());
			TimeZone_DD.selectByValue("UTC");
			editProfile.getAdditionalName().click();
			editProfile.getFirstNamePhonetic().clear();
			editProfile.getFirstNamePhonetic().sendKeys("first-name-phonetic");
			editProfile.getLastNamePhonetic().clear();
			editProfile.getLastNamePhonetic().sendKeys("last-name-phonetic");
			editProfile.getMiddleName().clear();
			editProfile.getMiddleName().sendKeys("middle-name");
			editProfile.getAlternateName().clear();
			editProfile.getAlternateName().sendKeys("Test-User-No1");
			editProfile.getUpdateProfileButton().click();
		}


		@AfterTest
		public void tearDown() {
			driver.close();
		}

	}

