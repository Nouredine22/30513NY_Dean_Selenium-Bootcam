package espnPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//header/nav[@id='global-nav']/ul[1]/li[6]/a[1]/span[1]/span[1]")
    public WebElement soccerButton;
    @FindBy(xpath = "//header/nav[@id='global-nav']/ul[1]/li[6]/div[1]/ul[2]/li[1]/div[1]/div[1]/ul[1]/li[2]/a[1]/span[1]/span[1]")
    public WebElement worldCupLink;



    public TablePage lookUpWorldCupTable(){
        clickOnElement(soccerButton);
        safeClickOnElement(worldCupLink);
        return new TablePage();
    }

}
