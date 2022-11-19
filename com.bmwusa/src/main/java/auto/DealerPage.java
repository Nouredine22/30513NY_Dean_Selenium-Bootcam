package auto;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DealerPage extends BasePage {
    public DealerPage (){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//button[@class='globalnav-primary-location-bar__set-location label-2--bold']")
    public WebElement localBMWCenter;

    public boolean AmIReadyToFindDealer(){
        return isElementVisible(localBMWCenter);
    }

}
