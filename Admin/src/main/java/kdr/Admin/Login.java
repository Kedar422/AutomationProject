package kdr.Admin;

import pageObject.LoginPage;

public class Login extends BaseClass {
	
	public static void loginCredentials(String username, String Pswd){
		LoginPage loginPage = new LoginPage(driver);
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(Pswd);
		loginPage.loginBtn().click();
	}

}
