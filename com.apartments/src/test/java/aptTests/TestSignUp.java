package aptTests;

import apartPages.HomePage;
import base.BasePage;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.testng.AssertJUnit.assertTrue;


public class TestSignUp extends BasePage {

    @Test
    public void testSignUp() throws SQLException {
        HomePage homePage =new HomePage();
        homePage.navigateToCreateAnAccount();

        //assertTrue(HomePage.createAccountText.isDisplayed());
    }
}
