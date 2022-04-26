package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;
import java.util.List;
public class Search {
    public WebElement search_field(){
        WebElement search_field= Hooks.driver.findElement(By.id("small-searchterms"));
        return search_field;
    }
    public WebElement name_product(){
        WebElement name_product= Hooks.driver.findElement(By.id("small-searchterms"));
        return name_product;
    }
    public WebElement searchBtn(){
        WebElement searchBtn= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
        return searchBtn;
    }
    public List<WebElement> Result(){
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a"));
    }
}
