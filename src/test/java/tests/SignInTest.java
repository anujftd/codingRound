package tests;

import com.sun.javafx.PlatformUtil;
import common.CommonTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import util.DriverConfig;
import util.Wait;

public class SignInTest extends CommonTest{


    @Test
    public void shouldThrowAnErrorIfSignInDetailsAreMissing() {
        WebDriver driver = super.getDriver();

        driver.get("https://www.cleartrip.com/");
        Wait.waitFor(2000);

        driver.findElement(By.linkText("Your trips")).click();
        driver.findElement(By.id("SignIn")).click();

        driver.findElement(By.id("signInButton")).click();

        String errors1 = driver.findElement(By.id("errors1")).getText();
        Assert.assertTrue(errors1.contains("There were errors in your submission"));

    }




}
