package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.testng.Assert;
import page.Login.LoginPage;
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
        //Username input field displayed or not
        Assert.assertTrue(loginPage.getEmailField().isDisplayed());
        //Username input field enable or not
        Assert.assertTrue(loginPage.getEmailField().isEnabled());
        //Username is shown in placeholder text
        Assert.assertEquals(loginPage.getEmailPlaceholder(), "Email");
        //Send username
        loginPage.getEmailField().sendKeys(username);
        Thread.sleep(1000);
    }

    @And("Enter password {string}")
    public void EnterPassword(String password) throws InterruptedException {
        //Password input field displayed or not
        Assert.assertTrue(loginPage.getPasswordField().isDisplayed());
        //Password input field enable or not
        Assert.assertTrue(loginPage.getPasswordField().isEnabled());
        //Password is shown in placeholder text
        Assert.assertEquals(loginPage.getPasswordPlaceholder(), "Password");
        //Send password
        loginPage.getPasswordField().sendKeys(password);
        Thread.sleep(1000);
    }

    @Then("click on login button")
    public void LoginButton() throws InterruptedException {
        //Button displayed or not
        Assert.assertTrue(loginPage.getLoginButton().isDisplayed());
        //Button enable or not
        Assert.assertTrue(loginPage.getLoginButton().isEnabled());
        //Verify the button text
        Assert.assertEquals(loginPage.getLoginButton().getText(), "LOGIN");
        //Click login button
        loginPage.getLoginButton().click();
        Thread.sleep(3000);
        //After login button successfully or not
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

    @After
    public void AfterScenario() throws IOException, InterruptedException {
        testContextSetup.testBase.WebDriverManager().quit();
    }
}
