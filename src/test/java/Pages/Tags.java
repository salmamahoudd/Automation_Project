package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class Tags {
    public WebElement electronicsCategory() {
        WebElement electronicsCategory = Hooks.driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
        return electronicsCategory;
    }
    public WebElement digital() {
        WebElement digital = Hooks.driver.findElement(By.xpath("(//a[@href=\"/digital-downloads\"])[1]"));
        return digital;
    }
}
