package authenticationTests;

import base.BasePage;
import crmPages.AccountHomePage;
import crmPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestLogin extends BasePage {

    public TestLogin() throws SQLException {
    }
    String email = db.executeQueryReadOne("select email from database1.myInfo;").toString();
    String password =db.executeQueryReadOne("select passwordcrm from database1.myInfo;").toString();



    @Test
    public void testLoginWithCorrectCredentials()  {
        HomePage homePage = new HomePage();
        AccountHomePage accountHomePage = new AccountHomePage();
        homePage.signIn(email,password);
        Assert.assertTrue(accountHomePage.isUserAccountOpened());
    }

    @Test
    public void testSigninSignout() {

        HomePage homePage = new HomePage();
        homePage.signIn(email,password);

        AccountHomePage accountHomePage = new AccountHomePage();
        accountHomePage.signOut();
        Assert.assertTrue(homePage.isUserOutOfAccountHomePage());
    }
}
