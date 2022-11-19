package optimumPages;

import base.BasePage;
import com.github.dockerjava.api.model.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage {
    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath="//a[contains(text(),'Hi nourredine85')]")
    public WebElement HiNouredine;

    public boolean isMyAccountDisplayed(){
        return isElementVisible(HiNouredine);
    }
}
