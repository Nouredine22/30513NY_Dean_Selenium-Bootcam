package expediaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    ///////////// signin WebElement////////

    @FindBy(xpath="//a[contains(text(),'Sign in')]")
    public WebElement signInButton ;
    @FindBy(xpath="//input[@id=\"loginFormEmailInput\"]")
    public WebElement inputEmail;
    @FindBy(xpath="//input[@id=\"loginFormPasswordInput\"]")
    public WebElement inputPassword;
    @FindBy(xpath="//button[@id=\"loginFormSubmitButton\"]")
    public WebElement submitButton;
    @FindBy(xpath="//body[@class='uitk-no-outline']")
    public WebElement emailAndPasswordIncorrectMsg;


    public void signIn(String email,String password){
        safeClickOnElement(signInButton);
        sendKeysToElement(inputEmail,email);
        sendKeysToElement(inputPassword,password);
        safeClickOnElement(submitButton);
    }
    public boolean isVerifyMSGDisplayed() {
        return isElementVisible(emailAndPasswordIncorrectMsg);
    }
    }


