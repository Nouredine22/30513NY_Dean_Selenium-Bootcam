package paraBankPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends BasePage {
    public RegistrationPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[contains(text(),'Register')]")
    public WebElement registerButton1;
    @FindBy(xpath="//input[@id='customer.firstName']")
    public WebElement firstNameField;
    @FindBy(xpath="//input[@id='customer.lastName']")
    public WebElement lastNameField;
    @FindBy(xpath="//input[@id='customer.address.street']")
    public WebElement addressField;
    @FindBy(xpath="//input[@id='customer.address.city']")
    public WebElement cityField;
    @FindBy(xpath="//input[@id='customer.address.state']")
    public WebElement stateField ;
    @FindBy(xpath="//input[@id='customer.address.zipCode']")
    public WebElement zipCodeField;
    @FindBy(xpath="//input[@id='customer.phoneNumber']")
    public WebElement phoneField;
    @FindBy(xpath="//input[@id='customer.ssn']")
    public WebElement ssnField;
    @FindBy(xpath="//input[@id='customer.username']")
    public WebElement userNameField ;
    @FindBy(xpath="//input[@id='customer.password']")
    public WebElement passwordField;
    @FindBy(xpath="//input[@id='repeatedPassword']")
    public WebElement confirmPasswordField;
    @FindBy(xpath="//tbody/tr[13]/td[2]/input[1]")
    public WebElement registerButton2;


    public void clickRegister1(){
        clickOnElement(registerButton1);
    }
    public void enterFirstName(String firstName){
        sendKeysToElement(firstNameField,firstName);
    }
    public void enterLastName(String lastName){
        sendKeysToElement(lastNameField,lastName);
    }
    public void enterAddress(String address){
        sendKeysToElement(addressField,address);
    }
    public void enterCity(String city){
        sendKeysToElement(cityField,city);
    }
    public void enterState(String state){
        sendKeysToElement(stateField,state);
    }
    public void enterZipCode(String zipCode){
        sendKeysToElement(zipCodeField,zipCode);
    }
    public void enterPhone(String phone){
        sendKeysToElement(phoneField,phone);
    }
    public void enterSSN(String ssn){
        sendKeysToElement(ssnField,ssn);
    }
    public void enterUserName(String userName){
        sendKeysToElement(userNameField,userName);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordField,password);
    }
    public void enterPasswordAgain(String password){
        sendKeysToElement(confirmPasswordField,password);
    }
    public void clickRegister2(){
        clickOnElement(registerButton2);
    }
    public AccountServicesPage registerAccount(String firstName,String lastName,String address,String city,String state,
                                String zipCode,String phone,String ssn,String userName,String password){
        clickRegister1();
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCity(city);
        enterState(state);
        enterZipCode(zipCode);
        enterPhone(phone);
        enterSSN(ssn);
        enterUserName(userName);
        enterPassword(password);
        enterPasswordAgain(password);
        clickRegister2();
        return new AccountServicesPage();
    }
}
