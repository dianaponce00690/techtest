package shoppingCart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.*;


public class ShoppingCartTests extends BaseTests {

    @Test
    public void testProductDetails(){
        String user = "Diana.ponce.testing@gmail.com";
        String password = "Refsc:004";
        var loginPage=homePage.clickLogin();
        loginPage.setUserCredentials(user, password).clickWomenClothes().clickShopNow().selectFirstProductList().increaseAmountProduct("2");


    }
}
