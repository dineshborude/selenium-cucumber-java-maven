package pages;

import org.openqa.selenium.By;
import utils.BrowserSetup;
import org.openqa.selenium.WebElement;

import static org.openqa.selenium.By.*;

public class HomePage_PO extends BrowserSetup {

    // Assuming that hamburgerMenu is an input element with type 'checkbox'
    private WebElement hamburger_menu = driver.findElement(xpath(""));
    public void clickHamburger(){
        hamburger_menu.click();
    }

}
