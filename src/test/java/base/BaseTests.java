package base;

import org.testng.annotations.AfterClass;
import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;
    protected WomensClothingSectionPage womensClothingSectionPage;
    protected  WomensClothingPage womensClothingPage;
    protected  ViewShopPage viewShopPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.adidas.co/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

   @AfterClass
    public void quitBrowser(){
        driver.quit();
    }



}
