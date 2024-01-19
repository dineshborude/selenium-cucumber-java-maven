package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utils.BrowserSetup.driver;

public class SignInPage {

    private WebElement userNameField = driver.findElement(By.xpath("//input[@id='usr']"));

    private WebElement passwordField = driver.findElement(By.xpath("//input[@id='pwd']"));

    private WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));

    public void setUserNameField(String name) {
        userNameField.sendKeys(name);
    }
    public void setPasswordFieldField(String pass) {
        userNameField.sendKeys(pass);
    }

    public void clickLogin() {
        loginButton.click();
    }

}
