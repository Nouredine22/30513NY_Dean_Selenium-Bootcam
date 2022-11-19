package investingTests;

import base.BasePage;
import invastingPages.BTCValue;
import invastingPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRetrieveBitcoinValue extends BasePage {

    @Test
    public void testFindBTCValueToday(){
       String btc = "Bitcoin";

        HomePage homePage= new HomePage();
        BTCValue btcValue= homePage.displayBTCValue(btc);
        Assert.assertTrue(btcValue.isBitcoinValueDisplayed());
    }
}
