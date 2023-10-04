
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Login_Test_Cases extends Parameters {
	WebDriver driver=new ChromeDriver();
	@BeforeTest
	public void setUp () {
		driver.manage().window().maximize();
		driver.get(URL);
		
	}
	@Test (description ="This A Test For Login Process")
	public void logInTest(){
	WebElement	logInInput=driver.findElement(By.id("email"));

	WebElement	emailInput=driver.findElement(By.id("pass"));
	WebElement	loginButton=driver.findElement(By.id("send2"));
	logInInput.sendKeys(email);
	emailInput.sendKeys(passWord);
	
	loginButton.click();
	}
	@AfterTest
	public void postTest(){
		
	}

}
