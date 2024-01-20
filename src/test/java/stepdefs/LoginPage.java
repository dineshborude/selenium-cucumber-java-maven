package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static WebDriver driver;

    @Given(":User navigates to login page.")
    public void user_navigates_to_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Given Block");
    }

    @When(": User enters (.*) and (.*)$")
    public void user_enters_user_and_pass(String username, String password) {
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/SignIn.html");
        driver.findElement(By.xpath("//input[@id='usr']")).sendKeys(username);

        driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys(password);

        System.out.print(username + " " +password);

        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    @Then(": User should be navigate to home page.")
    public void user_should_be_navigate_to_home_page() throws InterruptedException {
        System.out.println(" Then");
        Thread.sleep(5000);
        driver.close();
    }
}
