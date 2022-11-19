package bankOfAmericaPages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindVehicles extends BasePage {
    public FindVehicles(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//select[@class='geoRadius ddc-selectpicker form-control h-auto']")
    public WebElement selectDistanceFromZipCode;
    @FindBy(xpath="//a[contains(text(),'New')]")
    public WebElement newCarBox;
    @FindBy(xpath="//select[@class='year ddc-selectpicker form-control h-auto']")
    public WebElement selectYear;
    @FindBy(xpath="//select[@class='internetPrice ddc-selectpicker form-control h-auto']")
    public WebElement selectPrice ;
    @FindBy(xpath="//select[@class='make ddc-selectpicker form-control h-auto']")
    public WebElement selectMake;
    @FindBy(xpath="//select[@class='odometer ddc-selectpicker form-control h-auto']")
    public WebElement selectMileage;
    @FindBy(xpath="//button[@class='submit-search ui-button-submit BLANK btn btn-no-decoration btn-primary']")
    public WebElement searchButton;

    public void enterDistanceFromZipCode(String miles){
        selectFromDropdownByVisibleText(selectDistanceFromZipCode,miles);
    }
    public void selectNewCar(){
        clickOnElement(newCarBox);
    }
    public void enterYear(String year){
        selectFromDropdownByVisibleText(selectYear,year);
    }
    public void enterPriceRange(String price) {
        selectFromDropdownByVisibleText(selectPrice, price);
    }
    public void enterBrand(String brand) {
        selectFromDropdownByVisibleText(selectMake, brand);
    }
    public void enterMileage(String mileage) {
        selectFromDropdownByVisibleText(selectMileage, mileage);
    }
    public void searchCar() {
        clickOnElement(searchButton);
    }

        public InventoryPage doSearch(String miles,String year,String price,String brand,String mileage){
        enterDistanceFromZipCode(miles);
        selectNewCar();
        enterYear(year);
        enterPriceRange(price);
        enterBrand(brand);
        enterMileage(mileage);
        searchCar();
        return new InventoryPage();
        }
}
