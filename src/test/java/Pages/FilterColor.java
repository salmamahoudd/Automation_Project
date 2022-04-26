package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class FilterColor {
    public WebElement Apparel(){
        WebElement Apparel = Hooks.driver.findElement(By.cssSelector("a[href=\"/apparel\"]"));
        return Apparel ;
    }
    public WebElement Gray_color(){
        WebElement Gray_color= Hooks.driver.findElement(By.cssSelector("input[id=\"attribute-option-14\"]"));
        return Gray_color ;
    }

}
