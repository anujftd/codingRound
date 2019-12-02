package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import util.Wait;

public class HomePage {

    WebDriver driver;

    final String clearTripURL = "https://www.cleartrip.com/";
    By yourTrips = By.linkText("Your trips");
    By signIn = By.id("SignIn");

    public HomePage( WebDriver driver) {
        this.driver = driver;
        driver.get(clearTripURL);
        Wait.waitFor(2000);
    }

    public void launchYourTrips (){
        driver.findElement(yourTrips).click();
    }

    public void launchSignIn(){
        driver.findElement(signIn).click();
    }


}
