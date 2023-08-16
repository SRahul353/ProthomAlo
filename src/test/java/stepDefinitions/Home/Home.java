package stepDefinitions.Home;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.HomePage.HomePage;
import utils.TestContextSetup;

import static page.PageObjectManager.driver;

public class Home {
    TestContextSetup testContextSetup;
    HomePage homePage;

    public Home(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homePage = testContextSetup.pageObjectManager.getHomePage();

    }

    @Then("Verify that the Home page is displayed correctly")
    public void verifyThatTheHomePageIsDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.Get_HomePage().isDisplayed());
    }

    @Then("Verify that the Prothom Alo Application Title displayed correctly.")
    public void verifyThatTheProthomAloApplicationTitleDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase(homePage.expected_title));

    }

    @And("Verify that the Ham burger icon is displayed correctly")
    public void verifyThatTheHamBurgerIconIsDisplayedCorrectly() {
        Assert.assertTrue(homePage.Get_HamBurger().isDisplayed());
    }

    @When("Click on the Ham burger icon")
    public void clickOnTheHamBurgerIcon() {
        homePage.Get_HamBurger().click();
    }

    @Then("Verify that the side navigation bar displayed correctly")
    public void verifyThatTheSideNavigationBarDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.Get_Navigation().isDisplayed());
    }

    @And("Verify that the Home Menu is available on side navigation bar")
    public void verifyThatTheHomeMenuIsAvailableOnSideNavigationBar() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.Get_HomeMenu().isDisplayed());
    }

    @When("Click on Home Menu on side navigation bar")
    public void clickOnHomeMenuOnSideNavigationBar() throws InterruptedException {
        Thread.sleep(1000);
        homePage.Get_HomeMenu().click();
    }

    @And("Verify that the Search icon is displayed correctly")
    public void verifyThatTheSearchIconIsDisplayedCorrectly() throws InterruptedException {
       Assert.assertTrue(homePage.Get_SearchIcon().isDisplayed());
    }

    @When("Click on Search icon")
    public void clickOnSearchIcon() throws InterruptedException {
        Thread.sleep(1000);
        homePage.Get_SearchIcon().click();
    }

    @Then("Verify that the Search field displayed correctly")
    public void verifyThatTheSearchFieldDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.Get_SearchField().isDisplayed());
        Assert.assertTrue(homePage.Get_SearchButton().isDisplayed());
    }

    @And("Input {string} keyword in the Search field")
    public void inputKeywordInTheSearchField(String arg0) {
        homePage.Get_SearchField().sendKeys(arg0);
    }

    @When("Click on Search Button")
    public void clickOnSearchButton() {
        homePage.Get_SearchButton().click();
    }

    @Then("Verify that the Search result Page is displayed correctly")
    public void verifyThatTheSearchResultPageIsDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(homePage.Get_SearchResultPage().isDisplayed());
    }

    @And("Verify that the Top navigation bar is displayed correctly")
    public void verifyThatTheTopNavigationBarIsDisplayedCorrectly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homePage.Get_TopNavigation().isDisplayed());
    }

}
