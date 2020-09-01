package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WomensClothingSectionPage {
    private WebDriver driver;
    private  By clothes = By.cssSelector("a[href='/ropa-mujer']");

    public WomensClothingSectionPage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to select "Clothes" option and goes to the women's clothing page
     */
    public WomensClothingPage clickShopNow(){
        isPublicityDisplayed();
        WebDriverWait waitDriver = new WebDriverWait(driver,20);
        waitDriver.until(ExpectedConditions.elementToBeClickable(clothes));
        driver.findElement(clothes).click();
       return new WomensClothingPage(driver);

    }

    /*
        Method to close the publicity that is displayed sometimes
     */
    public void isPublicityDisplayed(){
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).perform();
    }
}
