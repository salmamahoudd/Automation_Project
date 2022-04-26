package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class CompareList {
    public WebElement GiftCards() {
        WebElement GiftCards = Hooks.driver.findElement(By.xpath("(//a[@href=\"/gift-cards\"])[1]"));
        return GiftCards;
    }
    public WebElement compareListProduct1() {
        WebElement compareListProduct1 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[2]"));
        return compareListProduct1;
    }
    public WebElement compareListProduct2() {
        WebElement compareListProduct2 = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[3]"));
        return compareListProduct2;
    }
    public WebElement compare_List() {
        WebElement compare_List = Hooks.driver.findElement(By.xpath("(//a[@href=\"/compareproducts\"])"));
        return compare_List;
    }
    public WebElement confirmation() {
        WebElement confirmation = Hooks.driver.findElement(By.xpath("(//div[@class=\"page-body\"])"));
        return confirmation;
    }
    public WebElement ClearListBtn() {
        WebElement ClearListBtn = Hooks.driver.findElement(By.xpath("(//a[@href=\"#\"])"));
        return ClearListBtn;
    }
}
