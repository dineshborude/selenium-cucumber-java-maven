package pages;

import org.openqa.selenium.By;
import utils.BrowserSetup;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.*;

public class HomePage_PO extends BrowserSetup {


   private String homepageURL = "https://anupdamoda.github.io/AceOnlineShoePortal/index.html";

    // Assuming that hamburgerMenu is an input element with type 'checkbox'
    private WebElement hamburgerMenu = driver.findElement(xpath(""));
    private List<WebElement> menuList = driver.findElements(By.xpath("//ul[@id='menu']/a/li"));

    private WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"menu\"]/a[2]/li"));

    public void clickHamburger(){
        hamburgerMenu.click();
    }

    public void assertMenuItems() throws InterruptedException {
        System.out.println("Number of menu items: " + menuList.size());
        for (int i = 1; i < menuList.size(); i++) {
            Thread.sleep(1000);
            System.out.println(menuList.get(i).getText());
        }
    }

    public void clickSignIn() {
        signInButton.click();
    }

    public String getHomepageURL() {
        String url =  this.homepageURL;
        return url;
    }
}
