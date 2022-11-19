package realEstate;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    //webelements
    @FindBy(xpath ="//button[@class='styled__LinkToggle-sc-1v106as-2 kSoeol']")
    public WebElement rentLink;
    @FindBy(xpath = "//body/div[@id='aria-hidden-when-modal-open']/div[2]/div[1]/div[1]/div[2]/div[1]/button[1]")
    public WebElement inputlocation;
    @FindBy(xpath= "//input[@id='TextField-minPrice']")
    public WebElement inputMin;
    @FindBy(xpath="//input[@id='TextField-withTextarea']")
    public WebElement inputMax;
    @FindBy(xpath="//input[@name='no-fee']")
    public WebElement noFeeBox;
    @FindBy(xpath="//button[contains(@class,\"sc-1v106as-8 ZEWTB\")]")
    public WebElement searchLink;

    //methods:
    public void wantToRent(){
        clickOnElement(rentLink);
    }
    public void chooseLocation(String neighborhood){
        clearSendKeysToElement(inputlocation,neighborhood);
    }
    public void enterBudget (String min, String max){
        sendKeysToElement(inputMin,min);
        sendKeysToElement(inputMax,max);
    }
    public void checkNoFeeBox(){
        clickOnElement(noFeeBox);
    }
    public void clickOnSearch(){
        clickOnElement(searchLink);
    }
    public AptForRentPage doSearch (String neighborhood, String min , String max){
        wantToRent();
        chooseLocation(neighborhood);
        enterBudget(min,max);
        checkNoFeeBox();
        clickOnSearch();
        return new AptForRentPage();
    }
}
