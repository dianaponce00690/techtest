package base;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.adidas.co/");
        //driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

   /*@AfterClass
    public void quitBrowser(){
        driver.quit();
    }*/



}
