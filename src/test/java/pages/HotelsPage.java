package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelsPage {

    WebDriver driver;

    By localityTextBox = By.id("Tags");

    By searchButton = By.id("SearchHotelsButton");

    By travellerSelection = By.id("travellersOnhome");

    public HotelsPage(WebDriver driver){this.driver = driver;}

    public void enterLocalities(String keysToEnter){
        driver.findElement(localityTextBox).sendKeys(keysToEnter);
    }

    public void travellerSelection(String travellerSelectionString){
        new Select(driver.findElement(travellerSelection)).selectByVisibleText(travellerSelectionString);
    }

    public void clickOnSearchButton(){
        driver.findElement(searchButton).click();
    }
}
