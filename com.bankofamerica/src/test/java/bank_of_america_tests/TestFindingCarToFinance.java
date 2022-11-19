package bank_of_america_tests;

import bankOfAmericaPages.FindAndFinanceCar;
import bankOfAmericaPages.FindVehicles;
import bankOfAmericaPages.InventoryPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.GenerateData;

public class TestFindingCarToFinance extends BasePage {

    @Test
    public void testFindingCar(){

        String state =  GenerateData.state();

        String myZipCode= "11220";
        String miles = "50 miles";
        String year = "2023";
        String price = "All Prices";
        String brand = "Toyota";
        String mileage = "30,000 or less";

        FindAndFinanceCar findAndFinanceCar= new FindAndFinanceCar();
        FindVehicles findVehicles = findAndFinanceCar.startShop(state,myZipCode);
        InventoryPage inventoryPage = findVehicles.doSearch(miles,year,price,brand,mileage);
        Assert.assertTrue( inventoryPage.isCountVehiclesDisplayed());
    }
}
