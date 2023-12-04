package auth;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Auth extends parameters {

	@BeforeTest
	public void setUp() {
		driver.manage().window().maximize();
		driver.get(website);

	}

	@Test(priority = 1)
	public void SignUp() throws InterruptedException {
		driver.get(SignupUrl);
		WebElement firstName = driver.findElement(By.id("firstname"));
		WebElement lasttName = driver.findElement(By.id("lastname"));
		WebElement emailEle = driver.findElement(By.id("email_address"));
		WebElement passWordEle = driver.findElement(By.id("password"));
		WebElement passWordCon = driver.findElement(By.id("password-confirmation"));
		WebElement button = driver.findElement(By.className("submit"));
		firstName.sendKeys((RandomFirstName));
		lasttName.sendKeys((RandomLastName));
		emailEle.sendKeys((email));
		passWordEle.sendKeys((password));
		passWordCon.sendKeys((password));
		button.click();
		Thread.sleep(2000);
		String welcomeMessage = driver.findElement(By.className("logged-in")).getText();

		softAssert.assertEquals(welcomeMessage.contains("Welcome"), true, "SignUp Validation");
		softAssert.assertAll();

	}

	@Test(priority = 2)
	public void LogOut() throws InterruptedException {
		
		WebElement action = driver.findElement(By.cssSelector(".action.switch"));
		WebElement signout = driver.findElement(By.className("authorization-link"));
		action.click();
		signout.click();
		Thread.sleep(10000);
		softAssert.assertEquals(driver.getCurrentUrl(), website, "logouts Validation");
		softAssert.assertAll();
	}

	@Test(priority = 3)
	public void LogIn() throws InterruptedException {
		driver.get(LogInUrl);
		Thread.sleep(7000);
		WebElement logInInput = driver.findElement(By.id("email"));

		WebElement emailInput = driver.findElement(By.id("pass"));
		WebElement loginButton = driver.findElement(By.id("send2"));
		logInInput.sendKeys(email);
		emailInput.sendKeys(password);
		loginButton.click();
		
		
		Thread.sleep(7000);
		String logInValidation = driver.findElement(By.className("logged-in")).getText();
		softAssert.assertEquals(logInValidation.contains("Welcome"), true, "Log IN Validation");
		softAssert.assertAll();

	}

	@AfterTest
	public void postTest() {

	}

}
