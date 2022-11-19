package crmPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[contains(text(),'Login')]")
    public WebElement loginButton1;
    @FindBy(xpath="//input[@name='email']")
    public WebElement emailBox;
    @FindBy(xpath="//input[@name='password']")
    public WebElement passwordBox;
    //below locator used both for; 1-login, 2-logout Assertion.
    @FindBy(xpath="//div[@class='ui fluid large blue submit button']")
    public WebElement loginButton2;



    public AccountHomePage signIn(String email,String password){
        safeClickOnElement(loginButton1);
        sendKeysToElement(emailBox,email);
        sendKeysToElement(passwordBox,password);
        safeClickOnElement(loginButton2);
        return new AccountHomePage();
    }
    //method for logout Assertion;
    public boolean isUserOutOfAccountHomePage(){
        return isElementVisible(loginButton2);
    }
}
