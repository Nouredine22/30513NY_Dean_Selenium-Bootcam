package eBayTests;

import base.BasePage;
import ebayPages.AddItemPage;
import ebayPages.CheckOutPage;
import ebayPages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddItemToCart extends BasePage {
    @Test
    public void testAddingItemsToCart(){
        String wantedItem = "learn java ";
        String category = "Books";

        HomePage homePage = new HomePage();
        AddItemPage addItemPage = homePage.doSearch( wantedItem,category);
        switchToTab();
        CheckOutPage checkOutPage = addItemPage.addToCart();
        Assert.assertTrue(checkOutPage.isItemInCart());
    }

}
