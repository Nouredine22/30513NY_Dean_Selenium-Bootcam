package optimumPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotspotsPage extends BasePage {
    public HotspotsPage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id='map_autocomplete']")
    public WebElement cityinput;
    @FindBy(xpath="//body/div[@id='site-wrapper']/div[5]/div[1]/div[1]/div[1]/span[3]/button[1]")
    public WebElement searchButton ;
    @FindBy(xpath="//div[@class='results-list-container']")
    public WebElement listOfResults;

    public void findListOfHotspots(String city){
        sendKeysToElement(cityinput,city);
        safeClickOnElement(searchButton);
    }
    public boolean isListOfResultsDisplayed(){
        return isElementVisible(listOfResults);
    }
}
