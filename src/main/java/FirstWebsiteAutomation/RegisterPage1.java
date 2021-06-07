package FirstWebsiteAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage1 
{
	@Test
	public void automateRegisterPage()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		PageObjectModel1 register = new PageObjectModel1(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		register.setFirstName("Ram");
		register.setLastName("Kumar");
		register.setAddress("ABCD Bazaar, XYZ State, India");
		register.setEmail("Ramkumar71000@gmail.com");
		register.setPhone("7091764403");
		register.clickGenderMale();
		register.clickHobbieCricket();
		register.clickHobbieMovies();
		register.clickHobbieHockey();
		register.setLanguage("English");
		register.setSkill("Java");
		register.setCountry("India");
		register.selectCountry("India");
		register.setBirthYear("1997");
		register.setBirthMonth("September");
		register.setBirthDay("14");
		register.setPassword("Abc@11111");
		register.setConfirmPassword("Abc@11111");
		register.clickSubmitButton();
	}

}
