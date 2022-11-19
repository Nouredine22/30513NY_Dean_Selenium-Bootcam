package mercedesPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//import java.util.List;

public class ServicePage extends BasePage {
    public ServicePage(){
        PageFactory.initElements(driver,this);
    }
    //WebElements:
    @FindBy(xpath="//li[@id='menu-item-92']")
    public WebElement scheduleServiceSP;

       //////////////my car info/////////
    @FindBy(xpath=" //div[@id='di-page-composer']//iframe")
    public WebElement iFrame;
    @FindBy(xpath="//button[@id='os_select_model_btn']")
    public WebElement selectBrandBox;
    @FindBy(xpath="//div[contains(text(),'Mercedes-Benz  Sprinter/Metris')]")
    public WebElement selectBrand2Box;

    @FindBy(xpath="//div[@id='dropdownYear']")
    public WebElement selectYearBox;
    @FindBy(xpath="//div[contains(text(),'2021')]")
    public WebElement selectYear2Box;

    @FindBy(xpath="//div[@id='dropdownModel']")
    public WebElement selectModelBox;
    @FindBy(xpath="//div[contains(text(),'Sprinter 1500')]")
    public WebElement selectModel2Box;



    @FindBy(xpath="//button[@id='os_start_btn']")
    public WebElement startButton ;
    @FindBy(xpath="//button[contains(text(),'20k')]")
    public WebElement mileageBox;
    @FindBy(xpath="//button[@id='WEB_SCHEDULER_UI_confirm_concerns']")
    public WebElement confirmButton;

    @FindBy(xpath="//div[contains(text(),'Choose an advisor...')]")
    public WebElement headerChooseAdviser;
    @FindBy(xpath="//div[@class='col-xs-12 col-sm-12 serviceAdvisorAsList mk-button-local os_service_advisor_list selectedAdvisorInList primary-mk-button-no-hover mk-button-local']")
    public WebElement chooseAdvisorLink;
    @FindBy(xpath="//h4[contains(text(),'Vehicle Drop-Off')]")
    public WebElement dropOfVehicleButton;
    @FindBy(xpath="//button[@title='Saturday, December 17, 2022 8:20 AM']")
    public WebElement pickDayAndTimeBox;
    @FindBy(xpath="//textarea[@id='gwt-uid-174']")
    public WebElement noteBox;
    @FindBy(xpath="//button[@id='os_next_btn']")
    public WebElement nextBox;
    @FindBy(xpath="//input[@id='gwt-uid-305']")
    public WebElement firstNameBox;
    @FindBy(xpath="//input[@id='gwt-uid-306']")
    public WebElement lastNameBox;
    @FindBy(xpath="//input[@id='gwt-uid-307']")
    public WebElement cellPhoneBox;
    @FindBy(xpath="//input[@id='gwt-uid-308']")
    public WebElement emailBox;
    @FindBy(xpath="//span[contains(text(),'terms and conditions')]")
    public WebElement termsAndConditionBox;
    @FindBy(xpath="//button[@class='gwt-Button buttonForMobile primary-mk-button mk-button-local submitLabel submitLabelDisabled']")
    public WebElement submitBox;

    //methods
    public void clickScheduleServiceSP(){
        safeClickOnElement(scheduleServiceSP);
    }


    public void selectMyCarInfo(String brand,String year,String model){
        switchToFrameByElement(iFrame);

        clickOnElement(selectBrandBox);
        jsClickOnElement(selectBrand2Box);

        clickOnElement(selectYearBox);
        jsClickOnElement(selectYear2Box);

        clickOnElement(selectModelBox);
        jsClickOnElement(selectModel2Box);
    }
    public void clickButtons() throws InterruptedException {
        jsClickOnElement(startButton);
        clickOnElement(mileageBox);
        jsClickOnElement(confirmButton);

        waitForVisibilityOfElement(headerChooseAdviser);
        jsClickOnElement(chooseAdvisorLink);  //  <=this element don't click    clickOnElement(confirmButton);

        safeClickOnElement(dropOfVehicleButton);
    }
    public void selectDayAndTime(){
        safeClickOnElement(pickDayAndTimeBox);
    }
    public void writeNote(String note){
        sendKeysToElement(noteBox,note);
    }
    public void clickNext(){
        clickOnElement(nextBox);
    }
    public void enterMyInfo(String firstName,String lastName,String cell,String email){
        sendKeysToElement(firstNameBox,firstName);
        sendKeysToElement(lastNameBox,lastName);
        sendKeysToElement(cellPhoneBox,cell);
        sendKeysToElement(emailBox,email);
    }
    public void checkBoxAndSubmit(){
        clickOnElement(termsAndConditionBox);
        clickOnElement(submitBox);
    }
    public ConfirmationPage setupAppoitment (String brand,String year,String model,String note,String firstName,String lastName,String cell,String email) throws InterruptedException {
        clickScheduleServiceSP();
        selectMyCarInfo(brand,year,model);
        clickButtons();
        selectDayAndTime();
        writeNote(note);
        clickNext();
        enterMyInfo(firstName,lastName,cell,email);
        checkBoxAndSubmit();
        return new ConfirmationPage();
    }
}
