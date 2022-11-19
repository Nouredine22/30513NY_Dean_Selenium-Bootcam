package espnTests;

import base.BasePage;
import espnPages.HomePage;
import espnPages.TablePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWorldCupStandings extends BasePage {
    @Test
    public void checkWorldCupGroupStanding() {
        HomePage homePage = new HomePage();
        TablePage tablePage = homePage.lookUpWorldCupTable();
        Assert.assertTrue(tablePage.isWCStandingTableDisplayed());
    }
}
