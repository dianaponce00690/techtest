package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.desktop.SystemSleepEvent;
import java.security.PublicKey;
import java.util.List;

public class WomensClothingPage {
    private WebDriver driver;
    private By products = By.cssSelector("div[class='gl-product-card__assets']");
    private By addProduct = By.cssSelector("button[data-auto-id='add-to-bag']");
    private  By sizeSelectorList = By.cssSelector("div[data-auto-id='size-selector']>button");
    private  By goViewShop = By.cssSelector("a[data-auto-id='view-bag-desktop']");
    private  By productTittle = By.cssSelector("div[class='product-description___2cJO2'] h1");
    private  By priceProduct= By.cssSelector("div[class='product-description___2cJO2']>div:nth-child(3)>h5+div>div>span");
    public String productName="";
    public String price="";

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
        isProductDescriptionEmpty();
        isPriceProductEmpty();
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

    public Boolean isProductDescriptionEmpty(){
        productName= driver.findElement(productTittle).getText();
        return productName.isEmpty();
    }

    public Boolean isPriceProductEmpty(){
        price= driver.findElement(priceProduct).getText();
        return  price.isEmpty();
    }

}
