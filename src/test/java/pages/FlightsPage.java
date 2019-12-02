package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import util.Wait;

import java.util.List;

public class FlightsPage {

    WebDriver driver;

    By oneWay = By.id("OneWay");
    By fromTag = By.id("FromTag");
    By toTag = By.id("ToTag");

    By searchButton = By.id("SearchBtn");
    By datePicker = By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a");

    By originOption = By.id("ui-id-1");
    By destinationOption = By.id("ui-id-2");

    By searchSummary = By.className("searchSummary");
    public FlightsPage(WebDriver driver){this.driver = driver;}


    public void clickOneWay(){
        driver.findElement(oneWay).click();
    }

    public void enterFromText(String fromText){
        driver.findElement(fromTag).clear();
        driver.findElement(fromTag).sendKeys("Bangalore");

        //wait for the auto complete options to appear for the origin

        Wait.waitFor(15000);
        List<WebElement> originOptions = driver.findElement(originOption).findElements(By.tagName("li"));
        originOptions.get(0).click();
    }

    public void enterToText(String toText){
        driver.findElement(toTag).clear();
        driver.findElement(toTag).sendKeys("Delhi");

        //wait for the auto complete options to appear for the destination

        Wait.waitFor(15000);

        //select the first item from the destination auto complete list
        List<WebElement> destinationOptions = driver.findElement(By.id("ui-id-2")).findElements(By.tagName("li"));
        destinationOptions.get(0).click();

    }

    public void selectDatePicker(){
        driver.findElement(datePicker).click();
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public boolean summaryPresence(){
        try {
            driver.findElement(searchSummary);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
