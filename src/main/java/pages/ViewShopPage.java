package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ViewShopPage {
    private WebDriver driver;
    private By dropdownList= By.cssSelector("div[class='ffSelectMenuMid']>ul>li");
    private By dropdown= By.className("ffSelect");
    public By productTitle = By.cssSelector("a[class='name']");
    public By priceProduct = By.cssSelector("div[class^='unitpricecolumn'] div");
    private WomensClothingPage womensClothingPage;

    public ViewShopPage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to increase the amount of the selected clothes
     */
    public void increaseAmountProduct(String productQuantity){
        WebDriverWait waitDriver = new WebDriverWait(driver,20);
        waitDriver.until(ExpectedConditions.elementToBeClickable(dropdown));
        driver.findElement(dropdown).click();
        waitDriver.until(ExpectedConditions.elementToBeClickable(dropdownList));

        List<WebElement> dropdownListElements =driver.findElements(dropdownList);
        for (WebElement li : dropdownListElements) {
            if (li.getText().equals(productQuantity)) {
                li.click();
            }
        }

        waitDriver.until(ExpectedConditions.elementToBeClickable(productTitle));
        isTheCorrectProductTittle();
        waitDriver.until(ExpectedConditions.elementToBeClickable(priceProduct));
        isTheCorrectPriceProduct();

    }

    public Boolean isTheCorrectProductTittle(){
        String productCart= driver.findElement(productTitle).getText();
        return womensClothingPage.productName.equals(productCart);

    }

    public Boolean isTheCorrectPriceProduct(){
        String priceCart= driver.findElement(priceProduct).getText();
        return womensClothingPage.price.equals(priceCart);
    }

}
