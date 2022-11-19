package realEstate;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AptForRentPage extends BasePage {
    public AptForRentPage (){
        PageFactory.initElements(driver,this);
    }

@FindBy(xpath="//h1[@class='srp-result-count']")
    public WebElement aptCount;

    public boolean isAprtVisible(){
        return isElementVisible(aptCount);
    }
}
