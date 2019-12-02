package common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.DriverConfig;

public abstract class CommonTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        //initiate driver before each test
        DriverConfig.setDriverPath();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }


    @AfterTest
    public void afterTest(){
        //Quit driver after each test
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    protected boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
