package espnPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TablePage extends BasePage {
public TablePage(){
    PageFactory.initElements(driver,this);
}
    @FindBy(xpath="//article[@class='sub-module standings']")
    public WebElement worldCupStandings;

public boolean isWCStandingTableDisplayed(){
    return isElementVisible(worldCupStandings);
}
}
