package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guitars {
    public Guitars(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='listing-tile']//h2[contains(text(), 'Electric Guitars ')]")
    WebElement electricGuitarsFromListing;

    public void clickElectricGuitars(){
        electricGuitarsFromListing.click();
    }
}
