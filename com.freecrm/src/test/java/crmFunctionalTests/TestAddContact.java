package crmFunctionalTests;

import base.BasePage;
import crmPages.AccountHomePage;
import crmPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;

public class TestAddContact extends BasePage {
    @Test
    public void testAddContact() throws SQLException {
        String email = db.executeQueryReadOne("select email from database1.myInfo;").toString();
        String password =db.executeQueryReadOne("select passwordcrm from database1.myInfo;").toString();

        String firstName =db.executeQueryReadOne("select first_name from database1.myInfo;").toString();
        String lastName = db.executeQueryReadOne("select last_name from database1.myInfo;").toString();

        HomePage homePage = new HomePage();
        AccountHomePage accountHomePage = new AccountHomePage();

        homePage.signIn(email,password);
        accountHomePage.addContact(firstName,lastName);
        Assert.assertTrue(accountHomePage.isContactAdded());
    }
}
