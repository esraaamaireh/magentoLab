package auth;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class parameters {
	SoftAssert softAssert=new SoftAssert();
	static WebDriver driver = new ChromeDriver();
	static String LogInUrl = "https://magento.softwaretestingboard.com/customer/account/login/";
	static String website = "https://magento.softwaretestingboard.com/";
	static String SignupUrl = "https://magento.softwaretestingboard.com/customer/account/create/";
	static String LogOutUrl = "https://magento.softwaretestingboard.com/customer/account/logoutSuccess/";
	static Random random = new Random();
	static String[] firstNames = { "zahra", "Afra", "Muso", "hrlly", "yamn", "mohaud" };
	static String[] lastNames = { "adil", "mosa", "ahmad", "kalis", "amer", "ibrahim" };
	static int randomNumber = random.nextInt(firstNames.length);
	static int randomNumberEmail = random.nextInt(1000);

	static String password = "Ab123456789.0";

	static String RandomFirstName = firstNames[randomNumber];

	static String RandomLastName = lastNames[randomNumber];

	static String email = RandomFirstName + RandomLastName + randomNumberEmail + "@gmail.com";

}
