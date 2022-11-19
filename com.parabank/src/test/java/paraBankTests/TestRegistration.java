package paraBankTests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import paraBankPages.AccountServicesPage;
import paraBankPages.RegistrationPage;
import utils.GenerateData;

public class TestRegistration extends BasePage {
    @Test
    public void testRegistration(){
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String address = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phone = GenerateData.mobilePhone();
        String ssn = "111223333";
        String userName = "dean";
        String password = "123";


        RegistrationPage registrationPage = new RegistrationPage();
        registrationPage.registerAccount(firstName,lastName,address,city,state,zipCode,phone,ssn,userName,password);
        AccountServicesPage accountServicesPage = new AccountServicesPage();
        Assert.assertFalse(accountServicesPage.loginToMyNewAccount());

    }
}
