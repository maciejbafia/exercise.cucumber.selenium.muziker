package pages;

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

    public void findItem(){
        searchForItemForm.sendKeys();
    }

    public void clickMusicalInstruments(){
        musicalInstrumentsBtn.click();
    }
}
