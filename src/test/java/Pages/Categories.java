package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class Categories {
    public WebElement computer_category(){
        WebElement computer_category = Hooks.driver.findElement(By.xpath("(//a[@href=\"/computers\"])[1]"));
        return computer_category ;
    }
}
