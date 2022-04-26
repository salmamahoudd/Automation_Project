package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import step_Definitions.Hooks;

public class RestPassword {
    public WebElement ForgotLink(){
        WebElement ForgotLink= Hooks.driver.findElement(By.cssSelector("span[class=\"forgot-password\"]"));
        return ForgotLink;
    }
    public WebElement validEmail(){
        WebElement validEmail= Hooks.driver.findElement(By.cssSelector("input[class=\"email\"]"));
        return validEmail;
    }
    public WebElement recover_button(){
        WebElement recover_button= Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
        return recover_button;
    }
    public WebElement message_displayed(){
        WebElement message_displayed= Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return message_displayed;
    }
}
