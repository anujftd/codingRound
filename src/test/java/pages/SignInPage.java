package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SignInPage {

    WebDriver driver;

    By signInButton = By.id("signInButton");
    By errors1 = By.id("errors1");
    By signInFrame = By.id("modal_window");

    public SignInPage( WebDriver driver) {
        this.driver = driver;
        switchToSignInFrame();
    }

    public void clickSignInButton (){
        driver.findElement(signInButton).click();
    }

    public String getErrorText(){
        return driver.findElement(errors1).getText();
    }

    public void switchToSignInFrame(){

        WebElement iframe = driver.findElement(signInFrame);
        driver.switchTo().frame(iframe);
    }

}
