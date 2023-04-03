package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MusicalInstruments {
    public MusicalInstruments(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='listing-tile']//h2[contains(text(), 'Guitars')]")
    WebElement guitarsFromListing;

    @FindBy(xpath = "//a[@class='listing-tile']//h2[contains(text(), 'Sale deals and offers')]")
    WebElement saleOffersBtn;



    public void clickGuitarsFromListing(){
        guitarsFromListing.click();
    }

    public void clickSaleOffersBtn(){
        saleOffersBtn.click();
    }


}
