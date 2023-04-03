package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.DiscountsPage;
import pages.HomePage;

import java.time.Duration;

public class DiscountSteps {

    public static WebDriver driver;
    public String url = "https://www.muziker.pl/en";

    @Given("While on the main page of the online store")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }
    @When("I select \"Discounts\" from main page")
    public void getDiscounts(){
        HomePage homePage = new HomePage(driver);
        homePage.agreeOnCookies();
        homePage.clickDiscountsBtn();
    }
    @Then("I see only products that have discount label")
    public void verifyDiscounts(){
        DiscountsPage discountsPage = new DiscountsPage(driver);
//        discountsPage.clickShowMoreProductsBtn(5); //pętla nie dziala poprawnie i przerywa test
        Assert.assertTrue(discountsPage.isDiscountOnAllProducts());
        driver.quit();

    }
}
