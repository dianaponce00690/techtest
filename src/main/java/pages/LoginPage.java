package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private By userInput= By.id("login-email");
    private By passwordInput= By.id("login-password");
    private By loginButton= By.cssSelector("button[data-auto-id='login-form-login']");

    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to sign in
     */
    public MyAccountPage setUserCredentials(String user, String password){
        WebDriverWait waitDriver = new WebDriverWait(driver,20);
        waitDriver.until(ExpectedConditions.elementToBeClickable(userInput));
        driver.findElement(userInput).sendKeys(user);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).click();
        return new MyAccountPage(driver);
    }

}
