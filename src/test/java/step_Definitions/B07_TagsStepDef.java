package step_Definitions;

import Pages.Tags;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class B07_TagsStepDef {
    Tags tag=new Tags();
    @Given("user click on different tags")
    public void tags(){
        tag.electronicsCategory().click();
        tag.digital().click();
    }
}
