package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectricGuitars {
    public ElectricGuitars(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//a[@class='listing-tile']//h2[contains(text(), 'Electric Guitars - All Shapes')]")
    WebElement electricGuitarsAllShapesFromListing;

    @FindBy(xpath = "//a[@class='listing-tile']//h2[contains(text(), '8-string Guitars')]")
    WebElement eightStringGuitarsFromListing;

    public void clickElectricGuitarsAllShapes(){
        electricGuitarsAllShapesFromListing.click();
    }

    public void clickEightStringGuitars(){
        eightStringGuitarsFromListing.click();
    }

}
