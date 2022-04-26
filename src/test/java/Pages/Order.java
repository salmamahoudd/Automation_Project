package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class Order {
    public WebElement Electronics() {
        WebElement Electronics = Hooks.driver.findElement(By.xpath("(//a[@href=\"/electronics\"])[1]"));
        return Electronics;
    }
    public WebElement Cellphones() {
        WebElement Cellphones = Hooks.driver.findElement(By.xpath("(//a[@href=\"/cell-phones\"])[3]"));
        return Cellphones;
    }
    public WebElement productCart() {
        WebElement productCart = Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[1]"));
        return productCart;
    }
    public WebElement shoppingOrder() {
        WebElement shoppingOrder = Hooks.driver.findElement(By.cssSelector("li[id=\"topcartlink\"]"));
        return shoppingOrder;
    }
    public WebElement Terms() {
        WebElement Terms= Hooks.driver.findElement(By.cssSelector("input[id=\"termsofservice\"]"));
        return Terms;
    }
    public WebElement Checkout() {
        WebElement Checkout= Hooks.driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
        return Checkout;
    }
    public WebElement FirstNameData() {
        WebElement FirstNameData= Hooks.driver.findElement(By.id("BillingNewAddress_FirstName"));
        return FirstNameData;
    }
    public WebElement LastNameData() {
        WebElement LastNameData= Hooks.driver.findElement(By.id("BillingNewAddress_LastName"));
        return LastNameData;
    }
    public WebElement EmailData() {
        WebElement EmailData= Hooks.driver.findElement(By.id("BillingNewAddress_Email"));
        return EmailData;
    }
    public WebElement CountryId() {
        WebElement CountryId= Hooks.driver.findElement(By.id("BillingNewAddress_CountryId"));
        return CountryId;
    }
    public WebElement CityData() {
        WebElement CityData= Hooks.driver.findElement(By.id("BillingNewAddress_City"));
        return CityData;
    }
    public WebElement Address1() {
        WebElement Address1= Hooks.driver.findElement(By.id("BillingNewAddress_Address1"));
        return Address1;
    }
    public WebElement ZipPostalCode() {
        WebElement ZipPostalCode= Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        return ZipPostalCode;
    }
    public WebElement PhoneNumber() {
        WebElement PhoneNumber= Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        return PhoneNumber;
    }
    public WebElement button1() {
        WebElement button1= Hooks.driver.findElement(By.xpath("(//button[@type=\"button\"])[5]"));
        return button1;
    }
    public WebElement shippingoption() {
        WebElement shippingoption= Hooks.driver.findElement(By.cssSelector("input[id=\"shippingoption_0\"]"));
        return shippingoption;
    }
    public WebElement button2() {
        WebElement button2= Hooks.driver.findElement(By.xpath("(//button[@class=\"button-1 shipping-method-next-step-button\"])"));
        return button2;
    }
    public WebElement paymentmethod() {
        WebElement paymentmethod= Hooks.driver.findElement(By.cssSelector("input[id=\"paymentmethod_0\"]"));
        return paymentmethod;
    }
    public WebElement button3() {
        WebElement button3= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-method-next-step-button\"]"));
        return button3;
    }
    public WebElement button4() {
        WebElement button4= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 payment-info-next-step-button\"]"));
        return button4;
    }
    public WebElement button5() {
        WebElement button5= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 confirm-order-next-step-button\"]"));
        return button5;
    }
    public WebElement the_success_message_is_displayed() {
        WebElement the_success_message_is_displayed= Hooks.driver.findElement(By.xpath("(//div[@class=\"title\"])[1]"));
        return the_success_message_is_displayed;
    }
}
