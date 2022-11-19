package crmPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountHomePage extends BasePage {
    public AccountHomePage(){
        PageFactory.initElements(driver,this);
    }
    //element for signIn tests: //-----------------------------------------
    @FindBy(xpath="//span[@class='user-display']")
    public WebElement userWelcomeMSG;

    //elements for SignOut test;//-------------------------------------------
    @FindBy(xpath="//div[@class='ui basic button floating item dropdown']")
    public WebElement settingbutton;
    @FindBy(xpath="//span[contains(text(),'Log Out')]")
    public WebElement logOutButton;

    //elemets for add contact test//------------------------------------------
    @FindBy(xpath="//div[@id='main-nav']")
    public WebElement leftPanel;
    @FindBy(xpath="//body/div[@id='ui']/div[1]/div[1]/div[3]/button[1]")
    public WebElement contactPlusSign;
    @FindBy(xpath="//input[@name='first_name']")
    public WebElement firstNameBox;
    @FindBy(xpath="//input[@name='last_name']")
    public WebElement lastNameBox;
    @FindBy(xpath="//button[@class='ui linkedin button']")
    public WebElement saveButton;
    //below for assertion
    @FindBy(xpath="//div[@class='ui header item mb5 light-black']")
    public WebElement contactAddedMSG;



    public boolean isUserAccountOpened(){
        return isElementVisible(userWelcomeMSG);
    }
    public HomePage signOut(){
        clickOnElement(settingbutton);
        clickOnElement(logOutButton);
        return new HomePage();
    }

    public void addContact(String firstName,String lastName){
        hoverOverElement(leftPanel);
        safeClickOnElement(contactPlusSign);
        sendKeysToElement(firstNameBox,firstName);
        sendKeysToElement(lastNameBox,lastName);
        safeClickOnElement(saveButton);
    }
    public boolean isContactAdded(){
        return isElementVisible(contactAddedMSG);
    }

}
