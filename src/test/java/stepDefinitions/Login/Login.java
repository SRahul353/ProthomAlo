package stepDefinitions.Login;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.testng.Assert;
import page.LoginPage.LoginPage;
import utils.TestContextSetup;

import java.io.IOException;

public class Login {

    TestContextSetup testContextSetup;
    LoginPage loginPage;

    public Login(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.loginPage = testContextSetup.pageObjectManager.getLoginPage();

    }

    @Given("Enter username {string}")
    public void EnterUsername(String username) throws InterruptedException {
        loginPage.getEmailField().sendKeys(username);
        Thread.sleep(1000);
    }

    @And("Enter password {string}")
    public void EnterPassword(String password) throws InterruptedException {
        loginPage.getPasswordField().sendKeys(password);
        Thread.sleep(1000);
    }

    @Then("click on login button")
    public void LoginButton() throws InterruptedException {
        loginPage.getLoginButton().click();
        Thread.sleep(3000);
    }

    @Then("Error message should be displayed")
    public void ErrorDisplayed() {
        try {
            Assert.assertTrue(loginPage.getErrorText().isDisplayed());
            Assert.assertEquals(loginPage.getErrorText().getText(), "Your email address or password is incorrect. Please check and try again");
        } catch (Exception ex) {
            System.out.println("Username Field not empty");
        }
    }


    @Then("Verify that the Login page is displayed correctly")
    public void verifyThatTheLoginPageIsDisplayedCorrectly() {
        Assert.assertTrue(loginPage.Get_LoginPage().isDisplayed());
    }

    @Then("Verify that the Login Option is displayed correctly")
    public void verifyThatTheLoginOptionIsDisplayedCorrectly() {
        Assert.assertTrue(loginPage.get_LoginOption().isDisplayed());
    }

    @When("Click on Login Option")
    public void clickOnLoginOption() {
        loginPage.get_LoginOption().click();
    }

    @And("Verify that the Email field displayed correctly")
    public void verifyThatTheEmailFieldDisplayedCorrectly() {
        //Username input field displayed or not
        Assert.assertTrue(loginPage.getEmailField().isDisplayed());
        //Username input field enable or not
        Assert.assertTrue(loginPage.getEmailField().isEnabled());
        //Username is shown in placeholder text
        Assert.assertEquals(loginPage.getEmailPlaceholder(), "Email");
    }

    @And("Verify that the login button displayed correctly")
    public void verifyThatTheLoginButtonDisplayedCorrectly() {
        //Button displayed or not
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        //Button enable or not
        Assert.assertTrue(loginPage.getLoginButton().isEnabled());
        //Verify the button text
        Assert.assertEquals(loginPage.getLoginButton().getText(), "LOGIN");
    }

    @And("Verify that the password field displayed correctly")
    public void verifyThatThePasswordFieldDisplayedCorrectly() {
        //Password input field displayed or not
        Assert.assertTrue(loginPage.getPasswordField().isDisplayed());
        //Password input field enable or not
        Assert.assertTrue(loginPage.getPasswordField().isEnabled());
        //Password is shown in placeholder text
        Assert.assertEquals(loginPage.getPasswordPlaceholder(), "Password");
    }
}
