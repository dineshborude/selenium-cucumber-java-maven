package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='usr']")
    private WebElement userNameField;

    @FindBy(xpath = "//input[@id='pwd']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement loginButton;

    @FindBy(xpath = "//*[@id='ShoeType']")
    private WebElement shoesElement;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void setUserNameField(String name) {
        userNameField.sendKeys(name);
    }

    public void setPasswordFieldField(String pass) {
        passwordField.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void loginValidUser(String username, String password) {
        userNameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void assertShoesDisplayed() {
        shoesElement.isDisplayed();
    }
}
