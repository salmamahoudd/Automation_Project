package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class Registration {
    public WebElement registerLink(){
        WebElement registerLink= Hooks.driver.findElement(By.className("ico-register"));
        return registerLink;
    }
    public WebElement FirstName(){
        WebElement FirstName= Hooks.driver.findElement(By.cssSelector("input[id^=\"FirstName\"]"));
        return FirstName;
    }
    public WebElement LastName(){
        WebElement LastName= Hooks.driver.findElement(By.cssSelector("input[id^=\"LastName\"]"));
        return LastName;
    }
    public WebElement email(){
        WebElement email= Hooks.driver.findElement(By.name("Email"));
        return email;
    }
    public WebElement password(){
        WebElement password= Hooks.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement confirm_password(){
        WebElement confirm_password= Hooks.driver.findElement(By.id("ConfirmPassword"));
        return confirm_password;
    }
    public WebElement registerBtn(){
        WebElement registerBtn=  Hooks.driver.findElement(By.name("register-button"));
        return registerBtn;
    }
    public WebElement message(){
        WebElement message=  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
        return message;
    }
}
