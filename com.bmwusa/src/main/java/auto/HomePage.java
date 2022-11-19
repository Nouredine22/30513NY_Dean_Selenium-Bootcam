package auto;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[@aria-label='Build Your Own']")
    public WebElement buildYourOwnLink;

    public StartHerePage buildYourOwn(){
        clickOnElement(buildYourOwnLink);
        return new StartHerePage();
    }
}
