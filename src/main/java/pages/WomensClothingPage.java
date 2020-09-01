package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.desktop.SystemSleepEvent;
import java.util.List;

public class WomensClothingPage {
    private WebDriver driver;
    private By products = By.cssSelector("div[class='gl-product-card__assets']");
    private By addProduct = By.cssSelector("button[data-auto-id='add-to-bag']");
    private  By sizeSelectorList = By.cssSelector("div[data-auto-id='size-selector']>button");
    private  By goViewShop = By.cssSelector("a[data-auto-id='view-bag-desktop']");

    public WomensClothingPage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to select the first option displayed in the clothing list
     */
    public ViewShopPage selectFirstProductList(){
        WebDriverWait waitDriver = new WebDriverWait(driver,20);

        waitDriver.until(ExpectedConditions.elementToBeClickable(products));
        List<WebElement> list = driver.findElements(products);
        list.get(1).click();
        selectFirstSize();

        waitDriver.until(ExpectedConditions.elementToBeClickable(addProduct));
        driver.findElement(addProduct).click();
        waitDriver.until(ExpectedConditions.elementToBeClickable(goViewShop));
        driver.findElement(goViewShop).click();

        return new ViewShopPage(driver);
    }


    /*
        Method to select the first size of the selected clothes
     */
    public void selectFirstSize(){
        WebDriverWait waitDriver = new WebDriverWait(driver,20);
        waitDriver.until(ExpectedConditions.elementToBeClickable(sizeSelectorList));
        List<WebElement> sizeList = driver.findElements(sizeSelectorList);
        sizeList.get(1).click();
    }
}
