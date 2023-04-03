package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "//li[@class='mzkr-horizontal-scroll__item'] ")
    WebElement musicalInstrumentsBtn;

    @FindBy(xpath = "//input[@class='mzkr-nav__search-input w-100']")
    WebElement searchForItemForm;

    @FindBy(xpath = "//div[@class='btn mzkr-btn-success btn-lg text-nowrap py-3 mb-3 font-weight-bold w-100 p-16']")
    WebElement iAgreeOnCookies;

    @FindBy(xpath = "//div[@class='luigi-ac-button'][contains(text(),'Show all results')]")
    WebElement showAllResultsBtn;

    @FindBy(xpath = "//h2[@class='tile__header'][contains(text(),'Discounts')]")
    WebElement discountsBtn;


    public void clickDiscountsBtn(){
        discountsBtn.click();

    }
    public void findItem(){
        searchForItemForm.sendKeys("Aulos 302B Soprano Recorder C Beige", Keys.ENTER);
    }

    public void clickMusicalInstrumentsBtn(){
        musicalInstrumentsBtn.click();
    }

    public void agreeOnCookies(){
        iAgreeOnCookies.click();
    }
}
