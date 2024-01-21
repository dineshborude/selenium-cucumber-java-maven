package stepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.SignInPage;

public class LoginPage {

    public static WebDriver driver;
    SignInPage signIn;

    @Before
    public void browserSetup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("WebDriver Initialised!");
    }

    @Given(":User navigates to login page.")
    public void user_navigates_to_login_page() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
        driver.manage().window().maximize();
        System.out.println("Site Launched");

    }

    @When(": User enters (.*) and (.*)$")
    public void user_enters_user_and_pass(String username, String password) {

        signIn = new SignInPage(driver);

        signIn.setUserNameField(username);
        signIn.setPasswordFieldField(password);

        System.out.print(username + " " +password);

        System.out.println("User Logged In Successfully. . . ");
        signIn.clickLogin();

    }

    @Then(": User should be navigate to home page.")
    public void user_should_be_navigate_to_home_page() throws InterruptedException {
        signIn.assertShoesDisplayed();
        Thread.sleep(3000);
//        driver.close();
    }

    @After
    public void closeWebDriver() {
        driver.quit();
        System.out.println("WebDriver Closed!");
    }
}
