package bankOfAmericaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
   public LoginPage(){ PageFactory.initElements(driver,this);}

    @FindBy(xpath = "//div[@class='messaging-vipaa-module vipaa-pwd']")
    public WebElement loginFailedMSG;

   public boolean isLoginErrorDisplayed(){
       return isElementVisible(loginFailedMSG);
   }
}
