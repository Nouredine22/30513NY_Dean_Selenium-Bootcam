package apartPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.GenerateData;

//import java.sql.SQLException;
import java.util.List;

public class HomePage extends BasePage {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='headerLoginSection']/a")
    public List<WebElement> manageSignUpSignInBar;
    @FindBy(id = "signupFirstName")
    public WebElement firstName;
    @FindBy(id = "signupLastName")
    public WebElement lastName;
    @FindBy(id = "signupEmail")
    public WebElement emailAddress;


    public void navigateToCreateAnAccount(){
        //String passwordInput = "SELECT password FROM locations.password where id=1;";
        clickOnElement(manageSignUpSignInBar.get(1));
        sendKeysToElement(firstName, GenerateData.firstName());

        sendKeysToElement(lastName, GenerateData.lastName());

        sendKeysToElement(emailAddress, GenerateData.email());

    }
}
