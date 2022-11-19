package ebayPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends BasePage {
    public CheckOutPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//h2[contains(text(),'1 item added to cart')]")
    public WebElement countOfItemsAdded;

    public boolean isItemInCart(){
        return  isElementVisible(countOfItemsAdded);
    }
}
