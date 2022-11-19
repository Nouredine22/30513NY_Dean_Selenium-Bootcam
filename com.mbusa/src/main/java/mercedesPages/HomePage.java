package mercedesPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //WebElements:
    @FindBy(xpath="//span[@class='global-header__menu-l1-list-button-label']")
    public WebElement findDealerLink;
    @FindBy(xpath="//input[@class='form__input-field form__input-field--can-reset']")
    public WebElement locationBox;
    @FindBy(xpath="//button[contains(text(),'Search')]")
    public WebElement searchBox;
    @FindBy(xpath="//body/div[1]/main[1]/div[1]/div[2]/section[1]/div[1]/div[3]/div[2]/div[6]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/a[2]")
    public WebElement scheduleServiceHP;


    //methods:
    public void clickFindDealer(){
        clickOnElement(findDealerLink);
    }
    public void enterZipCode(String zipCode){
        sendKeysToElement(locationBox,zipCode);
    }
    public void clickSearch(){
        clickOnElement(searchBox);
    }
    public void clickScheduleServiceHP(){
        clickOnElement(scheduleServiceHP);
    }


    public ServicePage doSearch(String zipCode){
        clickFindDealer();
        enterZipCode(zipCode);
        clickSearch();
        clickScheduleServiceHP();
        return new ServicePage();
    }
}
