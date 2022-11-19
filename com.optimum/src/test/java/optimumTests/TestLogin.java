package optimumTests;

import base.BasePage;
import optimumPages.HomePage;
import optimumPages.MyAccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

public class TestLogin extends BasePage {
    @Test
    public void testLogin(){
        HomePage homePage = new HomePage();
        String id ="Nourredine85";
        String password = "Nourredean85";

        MyAccountPage myAccountPage = homePage.login(id,password);
        Assert.assertTrue(myAccountPage.isMyAccountDisplayed());
    }
}
