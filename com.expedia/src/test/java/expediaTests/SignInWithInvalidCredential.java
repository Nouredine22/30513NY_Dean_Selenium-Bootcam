package expediaTests;

import base.BasePage;
import expediaPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

import java.sql.SQLException;

public class SignInWithInvalidCredential extends BasePage {
    @Test

    public void signInWithInvalidEmailAndPassword() throws SQLException {
        String email = db.executeQueryReadOne("select firstName from students where idstudents = 002;").toString();
        String password = GenerateData.password();


        HomePage homePage = new HomePage();
        homePage.signIn(email,password);
        Assert.assertTrue(homePage.isVerifyMSGDisplayed());

    }
}
