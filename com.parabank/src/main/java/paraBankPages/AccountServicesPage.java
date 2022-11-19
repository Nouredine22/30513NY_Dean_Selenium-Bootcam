package paraBankPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountServicesPage extends BasePage {
    public AccountServicesPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//p[contains(text(),'Your account was created successfully. You are now')]")
    public  WebElement accountSuccessfullyCreated ;


    public Boolean loginToMyNewAccount(){
        return isElementVisible(accountSuccessfullyCreated);
    //public String loginToMyNewAccount(){
       // return getTrimmedElementText(accountSuccessfullyCreated);
    }
}
