package Pageobject;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class EditProfile {
		
		WebDriver driver = null;

		public EditProfile(WebDriver driver) {
			super();
			this.driver = driver;
		}
		
		By cityOrTown = By.xpath("//input[@id=\"id_city\"]");
		By countryDropDown = By.xpath("//select[@id='id_country']");
		By updateProfile = By.xpath("//input[@id='id_submitbutton']");
		By FirstName=By.id("id_firstname");
		By LastName=By.id("id_lastname");
		By MailDisplay=By.id("id_maildisplay");
		By TimeZone=By.id("id_timezone");
		By AddFile=By.xpath("//img[@title='Add file']");
		By PicDesc=By.id("id_imagealt");
		By AdditionalName=By.xpath("//*[contains(text(),'Additional names')]");
		By FirtNamePhonetic=By.id("id_firstnamephonetic");
		By LastNamePhonetic=By.id("id_lastnamephonetic");
		By MiddleName=By.id("id_middlename");
		By AlternateName=By.id("id_alternatename");
		
		
		
		public WebElement getFirstName() {
			return driver.findElement(FirstName);
		}
		public WebElement getLastName() {
			return driver.findElement(LastName);
		}
		public WebElement getCityOrTown() {
			return driver.findElement(cityOrTown);
		}
		public WebElement getMailDisplay() {
			return driver.findElement(MailDisplay);
		}
		
		public WebElement getcountryDropDown() {
			return driver.findElement(countryDropDown);
		}
		
		public WebElement getUpdateProfileButton() {
			return driver.findElement(updateProfile);
		}
		public WebElement getTimeZone() {
			return driver.findElement(TimeZone);
		}
		public WebElement getAddFile() {
			return driver.findElement(AddFile);
		}
		public WebElement getPicDesc()
		{
			return driver.findElement(PicDesc);
		}
		public WebElement getAdditionalName()
		{
			return driver.findElement(AdditionalName);
		}
		public WebElement getFirstNamePhonetic() {
			return driver.findElement(FirtNamePhonetic);
		}
		public WebElement getLastNamePhonetic() {
			return driver.findElement(LastNamePhonetic);
		}
		public WebElement getMiddleName() {
			return driver.findElement(MiddleName);
		}
		public WebElement getAlternateName() {
			return driver.findElement(AlternateName);
		}
	}





