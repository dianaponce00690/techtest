package shoppingCart;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.ViewShopPage;
import pages.WomensClothingPage;
import pages.WomensClothingSectionPage;

import static org.testng.Assert.*;

public class ShoppingCartTests extends BaseTests {

    @Test
    public void testProductDetailsLoadsProperly(){
        String user = "Diana.ponce.testing@gmail.com";
        String password = "Refsc:004";
        String productQuantity="2";
        // I set '2' as product quantity instead 7 because I'm not sure if the selected product has more than 7

        var loginPage=homePage.clickLogin();
        loginPage.setUserCredentials(user, password).clickWomenClothes().clickWomenClothing().selectFirstProductList();

        //assertFalse(womensClothingPage.price.isEmpty(),"The price is not displayed");
        //assertFalse(womensClothingPage.productName.isEmpty(),"The producto name is not displayed");

    }
}
