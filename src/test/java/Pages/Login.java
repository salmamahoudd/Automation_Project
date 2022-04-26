package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class Login {
    public WebElement login_Btn(){
        WebElement login_Btn= Hooks.driver.findElement(By.className("ico-login"));
        return login_Btn;

    }
    public WebElement Email(){
       return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement Password(){
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement LoginButton(){
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }



}

