package smoke;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import realEstate.AptForRentPage;
import realEstate.HomePage;

public class TestSearchingAprts extends BasePage {
@Test
    public void testSearchAprt()  {

    String neighborhood = "Queens";
    String min = "2000";
    String max ="3000";

    HomePage homePage = new HomePage();
    AptForRentPage aptForRentPage = homePage.doSearch(neighborhood,min ,max);
    Assert.assertTrue(aptForRentPage.isAprtVisible());


    //Thread.sleep(40000);
}
}
