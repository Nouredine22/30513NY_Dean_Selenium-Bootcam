package optimumTests;

import base.BasePage;
import optimumPages.HomePage;
import optimumPages.HotspotsPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestFindingHotspots extends BasePage {
    @Test
    public void testFindingHotspots(){
        String city = "Newark,NJ,USA";
        HomePage homePage = new HomePage();
        HotspotsPage hotspotsPage = new HotspotsPage();
        homePage.searchHotspot();
        hotspotsPage.findListOfHotspots(city);
        Assert.assertTrue(hotspotsPage.isListOfResultsDisplayed());
    }
}
