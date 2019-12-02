package common;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import util.DriverConfig;

public abstract class CommonTest {

    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        //initiate driver before each test
        DriverConfig.setDriverPath();
        driver = new ChromeDriver();
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
