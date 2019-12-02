package tests;

import common.CommonTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelsPage;
import util.Wait;

public class HotelBookingTest extends CommonTest {

    WebDriver driver;

    @Test
    public void shouldBeAbleToSearchForHotels() {

        driver = super.getDriver();
        HomePage homePage = new HomePage(driver);
        homePage.launchHotels();

        HotelsPage hotelsPage = new HotelsPage(driver);
        hotelsPage.enterLocalities("Indiranagar, Bangalore");
        hotelsPage.travellerSelection("1 room, 2 adults");
        hotelsPage.clickOnSearchButton();


    }


}
