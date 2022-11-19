package auto;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartHerePage extends BasePage {
    public  StartHerePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@aria-label='Select i7 Sedan']")
    public WebElement i7Link;
    @FindBy(xpath="//a[contains(text(),'Customize This Build')]")
    public WebElement customizeLink;
    @FindBy(xpath="//a[@class='button-next byo-core-type label-1 theme-core']")
    public WebElement nextColorLink;
    @FindBy(xpath="//div[@class='name byo-core-type label-2 theme-core']")
    public WebElement whiteLink;
    @FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")
    public WebElement optionsLink;
   // @FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]")
    //public WebElement parkingAssistLink;
    @FindBy(xpath="//a[@class='byo-dock__quote-link byo-core-type theme-core label-2']")
    public WebElement findDealerLink;

    public void chooseI7Sedan(){
        clickOnElement(i7Link);
    }

    public void optCustomize(){
        clickOnElement(customizeLink);
    }
    public void chooseColor(){
        clickOnElement(nextColorLink);
        clickOnElement(whiteLink);
    }
    //public void chooseOptions(){
    //    clickOnElement(optionsLink);
    //    clickOnElement(parkingAssistLink);
    //}

    public void findDealer(){
        clickOnElement(findDealerLink);
    }
    public DealerPage doSearch(){
        chooseI7Sedan();
        optCustomize();
        chooseColor();
      //  chooseOptions();
        findDealer();

       return new DealerPage();
    }
}
