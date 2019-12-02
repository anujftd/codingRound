package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import util.DriverConfig;
import util.Wait;

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

}
