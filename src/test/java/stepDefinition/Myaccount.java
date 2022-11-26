package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Myaccount {

	public RemoteWebDriver driver;

	//@Given("Launch the url and Navigate to Myaccount")
	public void launcherUrl() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=account/login");

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//span[@class='title'])[32]"))).build().perform();
	}
	
	@Then("Click register button")
	public void  registerbutton() {
		driver.findElement(By.xpath("(//span[@class='title'])[34]")).click();
	}
	

	@Then("Enter the Firstname")
	public void enterfirstname() {
		driver.findElement(By.id("input-firstname")).sendKeys("sure");
	}

	@Then("Enter the Lastname")
	public void enterlastname() {
		driver.findElement(By.id("input-lastname")).sendKeys("sure");
	}

	@And("Enter the Email")
	public void enteremail() {
		driver.findElement(By.id("input-email")).sendKeys("sure1234@gmail.com");

	}

	@Then("Enter the Telephone Number")
	public void telephonenumber() {
		driver.findElement(By.id("input-telephone")).sendKeys("8870883690");
	}

	@And("Enter the password")
	public void password() {
		driver.findElement(By.id("input-password")).sendKeys("sure@123");
	}

	@Then("Enter the confirm password")
	public void confirmpassword() {
		driver.findElement(By.id("input-confirm")).sendKeys("sure@123");
	}

	@And("Click the subscribe no")
	public void subscribe() {
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
	}

	@Then("Click the Agree to the  privacy policy")
	public void clickagree() {
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();
	}

	@And(" Click the continue button")
	public void continuebutton() {
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();

	}

}
