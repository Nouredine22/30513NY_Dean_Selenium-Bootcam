package mercedesTests;

import base.BasePage;
import mercedesPages.ConfirmationPage;
import mercedesPages.HomePage;
import mercedesPages.ServicePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

public class TestScheduleAptForService extends BasePage {
    @Test
    public void findDealerAndSetAptForService() throws InterruptedException {
        String zipCode= "11220";
        String brand = "Mercedes-Benz Sprinter/Metris";
        String year = "2019";
        String model = "Sprinter 1500";
        String note = "Student Test Automation";
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String cell = GenerateData.mobilePhone();
        String email = GenerateData.email();

        HomePage homePage= new HomePage();
        ServicePage servicePage = homePage.doSearch(zipCode);
        switchToTab();
        ConfirmationPage confirmationPage = servicePage.setupAppoitment(brand,year,model,note,firstName,lastName,cell,email);
        Assert.assertTrue(confirmationPage.isAppointementConfirmed());

    }
}
