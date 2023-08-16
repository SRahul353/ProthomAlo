package page.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    By _HomePage = By.xpath("//h2[@class='desktop-logo']//*[name()='svg']");
    By _HamBurger = By.xpath("(//div[@class='hamburger-line OLm0F'])[1]");
    By _Navigation = By.xpath("//div[@class='yaN-k']//nav[@class='navbar Xh8NA']");
    By _HomeMenu = By.xpath("(//nav[1]/ul[1]/li[1]/div[1]/a[1])[2]");
    By _SearchIcon = By.xpath("//span[@class='search-icon-wrapper FaggC']");
    By _SearchField = By.xpath("//input[@id='searchForm']");
    By _SearchButton = By.xpath("//button[@type='submit']//*[name()='svg']");
    By _SearchResultPage = By.xpath("//h1[contains(text(),'অনুসন্ধান')]");
    By _TopNavigation = By.xpath("//nav[@class='navbar Xh8NA']");




    public String expected_title = "প্রথম আলো | বাংলা নিউজ পেপার";
    public WebElement Get_HomePage(){return driver.findElement(_HomePage);}
    public WebElement Get_HamBurger(){return driver.findElement(_HamBurger);}
    public WebElement Get_Navigation(){return driver.findElement(_Navigation);}
    public WebElement Get_HomeMenu(){return driver.findElement(_HomeMenu);}
    public WebElement Get_SearchIcon(){return driver.findElement(_SearchIcon);}
    public WebElement Get_SearchField(){return driver.findElement(_SearchField);}
    public WebElement Get_SearchButton(){return driver.findElement(_SearchButton);}
    public WebElement Get_SearchResultPage(){return driver.findElement(_SearchResultPage);}
    public WebElement Get_TopNavigation(){return driver.findElement(_TopNavigation);}



}
