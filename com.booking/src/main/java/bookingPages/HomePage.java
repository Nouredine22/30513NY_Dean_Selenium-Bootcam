package bookingPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//button[@data-modal-id='language-selection']")
    public WebElement languages;
    @FindBy(xpath="//div[@lang='fr']")
    public WebElement french;

    @FindBy(xpath= "//html[@lang='fr']")
    public WebElement pageInFrench;

    public void switchToFrench(){
        clickOnElement(languages);
        clickOnElement(french);
    }
    public boolean isPageInFrench(){
        return isElementVisible(pageInFrench);
    }
}
