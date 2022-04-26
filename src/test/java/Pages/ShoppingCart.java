package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

import java.util.List;

public class ShoppingCart {
    public WebElement shoppingCartProduct1() {
        WebElement shoppingCartProduct1 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));
        return shoppingCartProduct1;
    }
    public WebElement shoppingCartProduct2() {
        WebElement shoppingCartProduct2 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[3]"));
        return shoppingCartProduct2;
    }
    public WebElement ShoppingCart() {
        WebElement ShoppingCart = Hooks.driver.findElement(By.cssSelector("li[id=\"topcartlink\"]"));
        return ShoppingCart;
    }
    public List<WebElement> Count_Number() {
         return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
