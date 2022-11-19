package bankOfAmericaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindAndFinanceCar extends BasePage {
    public FindAndFinanceCar(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//input[@id='zipCodeField']")
    public WebElement zipCodeField;

    @FindBy(id = "stateSelectModal")
    public WebElement selectState;


    @FindBy(xpath="//a[@id='dtShopforCar']")
    public WebElement shopForCarButton;

    @FindBy(id = "stateSelectorSubmit")
    public WebElement goButton;
    @FindBy(xpath="//a[@id='shopNowButton']")
    public WebElement shopNowButton;


    //methods:
    public void setSelectState(String state){
        selectFromDropdownByVisibleText(selectState,state);
    }
    public void clickOnGoButton(){
        safeClickOnElement(goButton);
    }
    public void enterZipCode(String myZipCode){
            sendKeysToElement(zipCodeField,myZipCode);}

    public void shopForCar(){
        clickOnElement(shopForCarButton);}

    public void clickShopNow(){
        clickOnElement(shopNowButton);
    }
    public FindVehicles startShop(String state, String myZipCode){

        setSelectState(state);
        clickOnGoButton();
        enterZipCode(myZipCode);
        shopForCar();
        clickShopNow();
        return new FindVehicles();
    }
}
