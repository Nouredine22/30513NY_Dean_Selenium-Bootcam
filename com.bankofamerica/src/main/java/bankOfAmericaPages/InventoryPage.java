package bankOfAmericaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends BasePage {
    public InventoryPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//div[@class='total-count d-inline']")
    public WebElement countVehiclesFound;

    public boolean isCountVehiclesDisplayed(){
        return isElementVisible(countVehiclesFound);
    }
}
