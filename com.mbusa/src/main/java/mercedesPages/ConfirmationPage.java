package mercedesPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage {
    public ConfirmationPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[@class='gwt-Label alertModalMessage']")
    public WebElement appointementConfirmed;

    public boolean isAppointementConfirmed(){
        return isElementVisible(appointementConfirmed);
    }
}
