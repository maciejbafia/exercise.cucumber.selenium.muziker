package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResults {
    public SearchResults(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h4[contains(text(), 'Aulos 302B Soprano Recorder C Beige')]")
    WebElement sopranoRecorder;

    public void clickSopranoRecorder(){
        sopranoRecorder.click();
    }
    public String getSopranoRecorderName(){
        return sopranoRecorder.getText();
    }
}
