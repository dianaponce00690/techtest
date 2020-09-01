package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class MyAccountPage {
    private WebDriver driver;
    private By womenButton= By.cssSelector("a[manual_cm_sp$='MUJER']");

    public MyAccountPage(WebDriver driver){
        this.driver= driver;
    }

    /*
        Method to select "Women" button and go to the women's clothing page
     */
    public WomensClothingSectionPage clickWomenClothes(){
        driver.findElement(womenButton).click();
        return new WomensClothingSectionPage(driver);
    }







}
