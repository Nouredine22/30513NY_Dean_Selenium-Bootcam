package bankOfAmericaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public  HomePage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@class='cs-onlineId1 spa-input-text']" )
    public WebElement inputUsername;
    @FindBy(xpath = "//input[@id='passcode1']" )
    public WebElement inputPassword ;
    @FindBy(xpath = "//button[@id='signIn']" )
    public WebElement loginButton;

    @FindBy(id = "signin-message")
    public WebElement loginMessage;

    //methods:


    public void enterUserID(String id){
        clearSendKeysToElement(inputUsername,id);
    }
    public void enterPassword(String password){
        clearSendKeysToElement(inputPassword,password);
    }
    public void clickLogin(){
        safeClickOnElement(loginButton);
    }
    public LoginPage doLogin(String id,String password){

        enterUserID(id);
        enterPassword(password);
        clickLogin();
        return new LoginPage();
    }
    public String getLoginMessage(){
        return getTrimmedElementText(loginMessage);
    }
    




}
