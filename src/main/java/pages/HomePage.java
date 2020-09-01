package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By loginButton= By.cssSelector("a[href='/account-login']");


    public HomePage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to select the login option
     */
    public LoginPage clickLogin(){
        driver.findElement(loginButton).click();
        return new LoginPage(driver);
    }

}
