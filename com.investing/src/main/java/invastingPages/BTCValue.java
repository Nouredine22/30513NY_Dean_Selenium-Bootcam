package invastingPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BTCValue extends BasePage {
    public BTCValue() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[@class='text-2xl']")
    public WebElement bitcoinValue;


    public boolean isBitcoinValueDisplayed() {
       return isElementVisible(bitcoinValue);
    }
}