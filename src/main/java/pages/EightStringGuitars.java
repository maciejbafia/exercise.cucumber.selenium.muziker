package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EightStringGuitars {

    public EightStringGuitars(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='link-overlay']//p[contains(text(), '8-string electric guitar')]")
    WebElement eightStringGuitar;

    public String getEightStringGuitarType(){
        return eightStringGuitar.getText();
    }
    //ESP Iron Cross James Hetfield Snow White
}
