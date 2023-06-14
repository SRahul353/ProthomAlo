package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import page.Login.LoginPage;

public class PageObjectManager {

    public static WebDriver driver;

    public LoginPage loginPage;


    public PageObjectManager(WebDriver driver) {this.driver = driver;}

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;

    }
}
