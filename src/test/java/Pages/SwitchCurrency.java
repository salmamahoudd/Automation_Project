package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class SwitchCurrency {
    public WebElement Switch_Currency(){
        WebElement Switch_Currency= Hooks.driver.findElement(By.cssSelector("select[id=\"customerCurrency\"]"));
        return Switch_Currency;
    }
}
