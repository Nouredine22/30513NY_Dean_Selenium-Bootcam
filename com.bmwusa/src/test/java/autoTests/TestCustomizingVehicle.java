package autoTests;

import auto.DealerPage;
import auto.HomePage;
import auto.StartHerePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

public class TestCustomizingVehicle extends BasePage {
    @Test
            public void testCustomVehicle() {

        HomePage homePage = new HomePage();
        StartHerePage startHerePage = homePage.buildYourOwn();
        DealerPage dealerPage = startHerePage.doSearch();
        Assert.assertTrue (dealerPage.AmIReadyToFindDealer());
    }
}
