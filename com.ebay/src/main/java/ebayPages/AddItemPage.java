package ebayPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddItemPage extends BasePage {
    public AddItemPage (){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//span[contains(text(),'Add to cart')]")
    public WebElement addToCartButton;


    public CheckOutPage addToCart(){
        clickOnElement(addToCartButton);
        return new CheckOutPage();
    }

}
