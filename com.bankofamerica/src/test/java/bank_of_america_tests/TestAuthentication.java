package bank_of_america_tests;

import bankOfAmericaPages.HomePage;
import bankOfAmericaPages.LoginPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;


public class TestAuthentication extends BasePage {

    @Test
    public void testWrongIDandPassword(){
        String id = GenerateData.email();
        String password = GenerateData.password();

        HomePage homePage = new HomePage();
        LoginPage loginPage = homePage.doLogin(id,password);
        Assert.assertTrue( loginPage.isLoginErrorDisplayed());
    }

    @Test
    public void testWithEmptyCredential() {
        String loginMessage = "Your User ID is missing. Please try again.";
        HomePage homePage = new HomePage();
        homePage.doLogin("","");
        Assert.assertEquals(homePage.getLoginMessage(),loginMessage);
    }
}
