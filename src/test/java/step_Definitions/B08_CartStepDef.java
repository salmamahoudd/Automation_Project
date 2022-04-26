package step_Definitions;

import Pages.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class B08_CartStepDef {
    ShoppingCart Cart=new ShoppingCart();
    @Given("user click on Jewelry category")
    public void Jewelry_category() throws InterruptedException{
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/jewelry");
        Thread.sleep(2000);

    }
    @Given("user add different products to Shopping cart")
    public void shoppingCart_Product()throws InterruptedException{
        Cart.shoppingCartProduct1().click();
        Thread.sleep(7000);
        Cart.shoppingCartProduct2().click();
    }
    @And("user go to Shopping cart")
    public void Shopping_Cart() throws InterruptedException{
        Cart.ShoppingCart().click();
        Thread.sleep(5000);
    }
    @And("count number of quantities")
    public void quantities(){
      String firstrow=  Cart.Count_Number().get(0).getAttribute("value");
      System.out.println(firstrow);

        String scandtrow=  Cart.Count_Number().get(1).getAttribute("value");
        System.out.println(scandtrow);

        int total = Integer.parseInt(firstrow) + Integer.parseInt(scandtrow);
        System.out.println(total);

    }

}
