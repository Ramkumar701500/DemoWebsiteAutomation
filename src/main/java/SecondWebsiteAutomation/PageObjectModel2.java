package SecondWebsiteAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel2 
{

	WebDriver driver;
	
	@FindBy(id="gender-male")
	WebElement genderMale;
	
	@FindBy(id="gender-female")
	WebElement genderFemale;
	
	@FindBy(id="FirstName")
	WebElement firstName;
	
	@FindBy(id="LastName")
	WebElement lastName;
	
	@FindBy(name="DateOfBirthDay")
	WebElement dayDropdown;
	
	@FindBy(name="DateOfBirthMonth")
	WebElement monthDropdown;
	
	@FindBy(name="DateOfBirthYear")
	WebElement yearDropdown;
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Company")
	WebElement company;
	
	@FindBy(id="Newsletter")
	WebElement newsLetter;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	
	@FindBy(id="register-button")
	WebElement registerButton;
	
	//WebDriver
	public PageObjectModel2(WebDriver Driver) 
	{
		driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	//Gender
	public void clickGenderMale()
	{
		genderMale.click();
	}	
	public void clickGenderFemale()
	{
		genderFemale.click();
	}
	
	//First name
	public void setFirstName(String FirstName)
	{
		firstName.sendKeys(FirstName);
	}
	
	//Last name
	public void setLastName(String LastName)
	{
		lastName.sendKeys(LastName);
	}
	
	//Date Of Birth
	public void setBirthDay(String BirthDay)
	{
		Select day = new Select(dayDropdown);
		day.selectByVisibleText(BirthDay);
	}
	public void setBirthMonth(String BirthMonth)
	{
		Select month = new Select(monthDropdown);
		month.selectByVisibleText(BirthMonth);
	}
	public void setBirthYear(String BirthYear)
	{
		Select year = new Select(yearDropdown);
		year.selectByVisibleText(BirthYear);
	}
	
	//Email address
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	//Company name
	public void setCompany(String Company)
	{
		company.sendKeys(Company);
	}
	
	//Newsletter
	public void clickNewsletter()
	{
		newsLetter.click();
		newsLetter.click();
	}
	
	//Password
	public void setPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	//Confirm password
	public void setConfirmPassword(String ConfirmPassword)
	{
		confirmPassword.sendKeys(ConfirmPassword);
	}
	
	//Register button
	public void clickRegisterButton()
	{
		registerButton.click();
	}
	
}
