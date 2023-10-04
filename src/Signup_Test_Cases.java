import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	public class Signup_Test_Cases extends Parameters {
		WebDriver driver=new ChromeDriver();
		@BeforeTest
		public void setUp () {
			driver.manage().window().maximize();
			driver.get(SignupUrl);
		}
	
	@Test
	public void testTow() {
	WebElement firstName=driver.findElement(By.id("firstname"));
	WebElement lasttName=driver.findElement(By.id("lastname"));
	WebElement emailEle=driver.findElement(By.id("email_address"));
	WebElement passWordEle=driver.findElement(By.id("password"));
	WebElement passWordCon=	driver.findElement(By.id("password-confirmation"));
	WebElement button =driver.findElement(By.className("submit"));

	firstName.sendKeys((fNameGenereate));
	lasttName.sendKeys((lNameGenereate));
	emailEle.sendKeys((email));
	passWordEle.sendKeys((passWord));
	passWordCon.sendKeys((passWord));
	button.click();
		
	}
	@AfterTest
	public void postTest() {
		
	}

}
