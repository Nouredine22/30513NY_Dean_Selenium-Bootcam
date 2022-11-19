package invastingPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath= "//input[@class='searchText arial_12 lightgrayFont js-main-search-bar']")
    public WebElement searchBar;
    @FindBy(xpath= "//label[@class='searchGlassIcon js-magnifying-glass-icon']")
    public WebElement searchButton;
    @FindBy(xpath= "//body/div[5]/section[1]/div[1]/div[2]/div[2]/div[1]/a[1]")
    public WebElement bitcoinUSA;


    //methods;

    public void searchInvestment (String btc){
        sendKeysToElement(searchBar,btc);
    }




    public void clickSearch(){
        clickOnElement(searchButton);
    }
    public void chooseBitcoin(){
        clickOnElement(bitcoinUSA);
    }

    public BTCValue displayBTCValue(String btc){
        searchInvestment(btc);
        clickSearch();
        chooseBitcoin();
        return new BTCValue();
    }
}
