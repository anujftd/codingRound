package tests;

import com.sun.javafx.PlatformUtil;
import common.CommonTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.HomePage;
import util.Wait;

import java.util.List;

public class FlightBookingTest extends CommonTest {

    WebDriver driver;

    @Test
    public void testThatResultsAppearForAOneWayJourney() {

        driver = super.getDriver();
        HomePage homePage = new HomePage(driver);

        homePage.launchFlights();

        Wait.waitFor(5000);
        FlightsPage flightsPage = new FlightsPage(driver);

        flightsPage.clickOneWay();

        //Enter From City
        flightsPage.enterFromText("Bangalore");

        Wait.waitFor(2000);

        //Enter To City
        flightsPage.enterToText("Delhi");

        Wait.waitFor(2000);

        //Select a date
        flightsPage.selectDatePicker();

        //all fields filled in. Now click on search
        flightsPage.clickSearchButton();

        Wait.waitFor(5000);

        //verify that result appears for the provided journey search
        Assert.assertTrue(flightsPage.summaryPresence());


    }


}
