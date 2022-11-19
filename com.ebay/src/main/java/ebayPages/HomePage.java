package ebayPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {
    public HomePage (){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//input[@id='gh-ac']")
    public WebElement searchBar;

    @FindBy(xpath="//select[@id='gh-cat']")
    public WebElement selectCategory;

    @FindBy(xpath="//input[@id='gh-btn']")
    public WebElement searchButton;
    @FindBy(xpath="//body/div[8]/div[4]/div[2]/div[1]/div[2]/ul[1]/li[2]/div[1]/div[2]/a[1]/div[1]/span[1]")
    public WebElement item1;




    public AddItemPage doSearch(String wantedItem, String category) {
        sendKeysToElement(searchBar, wantedItem);
        selectFromDropdownByVisibleText(selectCategory,category);
        clickOnElement(searchButton);
        clickOnElement(item1);
        return new AddItemPage();
    }
    }


