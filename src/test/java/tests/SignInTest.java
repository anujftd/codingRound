package tests;

import common.CommonTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignInPage;
import util.Wait;

public class SignInTest extends CommonTest{


    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
        WebDriver driver = super.getDriver();

        //Launch HomePage
        HomePage homePage = new HomePage(driver);

        //Launch SignIn Popup
        homePage.launchYourTrips();
        homePage.launchSignIn();

        Wait.waitFor(5000);
        //Tap On SignIn Button
        SignInPage signInPage = new SignInPage(driver);

        //Generate error message
        signInPage.clickSignInButton();

        Wait.waitFor(2000);
        //Assert the error
        Assert.assertTrue(signInPage.getErrorText().contains("There were errors in your submission"));

    }




}
