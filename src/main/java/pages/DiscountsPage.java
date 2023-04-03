package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DiscountsPage {
    public DiscountsPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='tile-content'][//div[@class='badge mb-1 text-uppercase badge-sm badge-discount']]")
    List<WebElement> productsWithDiscountLabel;

    @FindBy(xpath = "//div[@class='badge mb-1 text-uppercase badge-sm badge-discount']")
    WebElement discountLabel;

    @FindBy(xpath = "//a[@class='load-next-products mzkr-btn-primary mzkr-btn--md mzkr-mt-10 d-inline-flex']")
    WebElement showMoreProductsBtn;

    public boolean isDiscountLabelVisible() {
        return discountLabel.isDisplayed();
    }
// todo dodac kolejne produkty na stronie discount przed sprawdzeniem
    public void clickShowMoreProductsBtn(int numClick){
        for (int i = 0;i <numClick; i++){
            while (!showMoreProductsBtn.isEnabled())
                try {Thread.sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            showMoreProductsBtn.click();

        }

    }

    public boolean isDiscountOnAllProducts(){
        for(WebElement product: productsWithDiscountLabel){
            if(!product.isDisplayed()){
                return false;
            }
        }
        return true;
    }
    }

