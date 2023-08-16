package page;

import org.openqa.selenium.WebDriver;
import page.LoginPage.LoginPage;
import page.HomePage.HomePage;

public class PageObjectManager {

    public static WebDriver driver;

    public LoginPage loginPage;
    public HomePage homePage;


    public PageObjectManager(WebDriver driver) {this.driver = driver;}

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public HomePage getHomePage() {
        homePage = new HomePage(driver);
        return homePage;
    }

}
