package page.LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    By _LoginPage = By.xpath("//div[@class='-u-bO']");
    By _LoginOption = By.xpath("//button[@class='desktop-btn btn _9DzOy']");


    By emailField = By.xpath("//input[@placeholder='Email']");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//span[normalize-space()='LOGIN']");
    By errorText = By.xpath("//div[contains(text(),'Your email address or password is incorrect. Please check and try again')]");

    public LoginPage(WebDriver driver) {this.driver = driver;}

    public void isElementLoaded(By elementToBeLoaded) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementToBeLoaded));
    }

    public  WebElement getEmailField() {
        isElementLoaded(emailField);
        return driver.findElement(emailField);
    }

    public WebElement Get_LoginPage() {return driver.findElement(_LoginPage);}

    public String getEmailPlaceholder() {
        return driver.findElement(emailField).getAttribute("placeholder");
    }
    public String getPasswordPlaceholder() {
        return driver.findElement(passwordField).getAttribute("placeholder");
    }



    public WebElement getPasswordField(){
        isElementLoaded(passwordField);
        return driver.findElement(passwordField);
    }
    public  WebElement getLoginButton() {return driver.findElement(loginButton);}
    public  WebElement getErrorText() {return driver.findElement(errorText);}
    public  WebElement get_LoginOption() {return driver.findElement(_LoginOption);}






}
