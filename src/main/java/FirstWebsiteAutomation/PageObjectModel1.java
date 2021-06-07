package FirstWebsiteAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageObjectModel1 
{
	WebDriver driver;

	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"eid\"]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")
	WebElement phone;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")
	WebElement genderMale;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[2]/input")
	WebElement genderFemale;
	
	@FindBy(id="checkbox1")
	WebElement hobbie1;
	
	@FindBy(id="checkbox2")
	WebElement hobbie2;
	
	@FindBy(id="checkbox3")
	WebElement hobbie3;
	
	@FindBy(xpath="//*[@id=\"msdd\"]")
	WebElement languages;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[8]/a")
	WebElement english;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a")
	WebElement hindi;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[7]/label")
	WebElement justClickAnywhere;
	
	@FindBy(id="Skills")
	WebElement skillsDropdown;
	
	@FindBy(id="countries")
	WebElement countryDropdown;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")
	WebElement selectCountry;
	
	@FindBy(id="yearbox")
	WebElement yearDropdown;
	
	@FindBy(xpath="//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")
	WebElement monthDropdown;
	
	@FindBy(id="daybox")
	WebElement dayDropdown;
	
	@FindBy(id="firstpassword")
	WebElement password;
	
	@FindBy(id="secondpassword")
	WebElement confirmPassword;
	
	@FindBy(id="submitbtn")
	WebElement submitButton;
	
	//WebDriver
	public PageObjectModel1(WebDriver Driver) 
	{
		driver = Driver;
		PageFactory.initElements(Driver, this);
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
	
	//Address
	public void setAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	//Email address
	public void setEmail(String Email)
	{
		email.sendKeys(Email);
	}
	
	//Phone
	public void setPhone(String Phone)
	{
		phone.sendKeys(Phone);
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
	
	//Hobbies
	public void clickHobbieCricket()
	{
		hobbie1.click();
	}
	public void clickHobbieMovies()
	{
		hobbie2.click();
	}	
	public void clickHobbieHockey()
	{
		hobbie3.click();
	}
	
	//Languages
	public void setLanguage(String Language)
	{
		languages.click();
		if(Language.equals("English"))
		{
			english.click();
		}
		
		else if(Language.equals("Hindi"))
		{
			hindi.click();
		}
		
		justClickAnywhere.click();	
	}
	
	//Skills
	public void setSkill(String Skill)
	{
		Select skill = new Select(skillsDropdown);
		skill.selectByVisibleText(Skill);
	}
	
	//Country
	public void setCountry(String Country)
	{
		Select country = new Select(countryDropdown);
		country.selectByVisibleText(Country);
	}
	
	//Select Country
	public void selectCountry(String Country)
	{
		selectCountry.click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys(Country);
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	}
	
	//Date Of Birth
	public void setBirthYear(String BirthYear)
	{
		Select year = new Select(yearDropdown);
		year.selectByVisibleText(BirthYear);
	}
	public void setBirthMonth(String BirthMonth)
	{
		Select month = new Select(monthDropdown);
		month.selectByVisibleText(BirthMonth);
	}
	public void setBirthDay(String BirthDay)
	{
		Select day = new Select(dayDropdown);
		day.selectByVisibleText(BirthDay);
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
	
	//Submit button
	public void clickSubmitButton()
	{
		submitButton.click();
	}

}
