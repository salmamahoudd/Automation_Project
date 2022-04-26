package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

import java.util.List;

public class Wishlist {
    public WebElement BooksCategory() {
        WebElement BooksCategory = Hooks.driver.findElement(By.xpath("(//a[@href=\"/books\"])[1]"));
        return BooksCategory;
    }
    public WebElement wishlistProduct1() {
        WebElement wishlistProduct1 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[2]"));
        return wishlistProduct1;
    }
    public WebElement wishlistProduct2() {
        WebElement wishlistProduct2 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
        return wishlistProduct2;
    }
    public WebElement wishlist() {
        WebElement wishlist = Hooks.driver.findElement(By.xpath("(//a[@href=\"/wishlist\"])[1]"));
        return wishlist;
    }
    public List<WebElement> Numbers_of_quantities() {
        return Hooks.driver.findElements(By.cssSelector("input[class=\"qty-input\"]"));
    }
}
