package optimumPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="homeLoginFormOptimumId")
    public WebElement idbox;
    @FindBy(id="homeLoginFormPassword")
    public WebElement passwordBox;
    @FindBy(xpath="//button[contains(text(),'Sign in to Optimum.net')]")
    public WebElement signInBox;

    ////////////////// wifi WebElement//////////

    @FindBy(xpath="//div[@class='internet-menu']")
    public WebElement internetDiv;
    @FindBy(xpath="//a[contains(text(),'WiFi Hotspots')]")
    public WebElement wifi;


    public void enterId(String id){
        sendKeysToElement(idbox,id);
    }
    public void enterPassword(String password){
        sendKeysToElement(passwordBox,password);
    }
    public void clickSignIn(){
        clickOnElement(signInBox);
    }
    public  MyAccountPage login(String id, String password) {
        enterId(id);
        enterPassword(password);
        clickSignIn();
        return new MyAccountPage();
    }

        //method to test wifi hotspots

        public HotspotsPage searchHotspot(){
            hoverOverElement(internetDiv);
            safeClickOnElement(wifi);
            return new HotspotsPage();
    }
}
