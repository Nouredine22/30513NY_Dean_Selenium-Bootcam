package bookingTests;

import base.BasePage;
import bookingPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlobalizationTesting extends BasePage {
    @Test
    public void globalizationTestFrench (){
        HomePage homePage = new HomePage();
        homePage.switchToFrench();
        Assert.assertTrue(homePage.isPageInFrench());
    }
}
