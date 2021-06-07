package SecondWebsiteAutomation;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterPage2 
{
	@Test
	public void automateRegisterPage()
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		PageObjectModel2 register = new PageObjectModel2(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		register.clickGenderMale();
		register.setFirstName("Ram");
		register.setLastName("Kumar");
		register.setBirthDay("14");
		register.setBirthMonth("September");
		register.setBirthYear("1997");
		register.setEmail("Ramkumar71000@gmail.com");
		register.setCompany("Abc Tech");
		register.clickNewsletter();
		register.setPassword("Abc@11111");
		register.setConfirmPassword("Abc@11111");
		register.clickRegisterButton();
		
	}

}
