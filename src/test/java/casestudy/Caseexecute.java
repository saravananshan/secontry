package casestudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Caseexecute {
	
	WebDriver driver;
	@Given("the user opens the Testme app")
	public void the_user_opens_the_Testme_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\saravana\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("click on the signup button")
	public void click_on_the_signup_button() {
		  driver.findElement(By.partialLinkText("SignUp")).click();
	}

	@And("user enters username {string}")
	public void user_enters_username(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
		//driver.findElement(By.id("userName")).sendKeys(b);
		
	    
	}

	@And("user enters first name {string}")
	public void user_enters_first_name(String fn) {
	    driver.findElement(By.id("firstName")).sendKeys(fn);
	  //  throw new cucumber.api.PendingException();
	}

	@And("user enters last name {string}")
	public void user_enters_last_name(String ln) {
		driver.findElement(By.id("lastName")).sendKeys(ln);
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters password {string}")
	public void user_enters_password(String pw) {
		driver.findElement(By.id("password")).sendKeys(pw);
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters confirm password {string}")
	public void user_enters_confirm_password(String cp) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cp);
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters gender as male")
	public void user_enters_gender_as_male() {
		driver.findElement(By.xpath("//input[@value='Male']")).click();
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters email {string}")
	public void user_enters_email(String mail) {
		driver.findElement(By.id("emailAddress")).sendKeys(mail);
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters mobile number {string}")
	public void user_enters_mobile_number(String num) {
		driver.findElement(By.id("mobileNumber")).sendKeys(num);
	    //throw new cucumber.api.PendingException();
	}
	@And("user enters dob {string}")
	public void user_enters_dob(String date) {
		driver.findElement(By.id("dob")).sendKeys(date);
	    //throw new cucumber.api.PendingException();
	}

	@And("enters adress {string}")
	public void enters_adress(String add) {
	    driver.findElement(By.id("address")).sendKeys(add);
	    //throw new cucumber.api.PendingException();
	}

	@And("user enters selects security question")
	public void user_enters_selects_security_question() {
		driver.findElement(By.id("securityQuestion")).click();
		driver.findElement(By.xpath("//*[@id=\"securityQuestion\"]/option[2]")).click();
	}

	@And("user enters answer {string}")
	public void user_enters_answer(String dy) {
		driver.findElement(By.id("answer")).sendKeys(dy);
	}

	@When("register button is clicked")
	public void register_button_is_clicked() {
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
	
	@Given("launch the chrome driver and launch the test me app")
	public void launch_the_chrome_driver_and_launch_the_test_me_app() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.04.29\\Desktop\\saravana\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("clicks on the signin button")
	public void clicks_on_the_signin_button() {
		  driver.findElement(By.partialLinkText("SignIn")).click();
	}
	@When("user enters the {string}")
	public void user_enters_the(String p) {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(p);
	}

	@When("user enters {string} in step")
	public void user_enters_in_step(String gg) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(gg);
	}

	@Then("click in login button")
	public void click_in_login_button() {
		driver.findElement(By.xpath("//input[@name='Login']")).click();

	}
	@And("search product by type")
	public void search_product_by_type() {
	   // Actions k=new Actions(driver);
	  //  WebElement search=driver.findElement(By.id("myInput"));
	  //  k.keyDown(search ,Keys.SHIFT).perform();
	  //  k.sendKeys("h").pause(2000).sendKeys("e").pause(2000).sendKeys("a").pause(2000).sendKeys("d").pause(2000).perform();
	  // k.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Head')]"))).click();
	   driver.findElement(By.id("myInput")).sendKeys("bag");
	   driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	   
	}

	@Then("add to cart and clickcart")
	public void add_to_cart_and_clickcart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("go to payment page")
	public void go_to_payment_page() {
	    driver.close();
	}

	
	
}
