package steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pages.HomePage;
import pages.SearchResults;


public class SearchForItemSteps {

    public static WebDriver driver;
    public String url = "https://www.muziker.pl/en";


    @Given("I am not logged in, on the main page of the online store")
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @When("I type in search form name of an item that i want to find")
        public void lookForItemAndFindIt(){
        HomePage homePage = new HomePage(driver);
        homePage.agreeOnCookies();
        homePage.findItem();
    }

    @Then("I verify that i found what i was looking for")
        public void verifySearch(){
        SearchResults searchResults = new SearchResults(driver);
        Assert.assertEquals(searchResults.getSopranoRecorderName(),"Aulos 302B Soprano Recorder C Beige");
        driver.quit();
    }

}
