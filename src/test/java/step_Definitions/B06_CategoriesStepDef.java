package step_Definitions;

import Pages.Categories;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;

public class B06_CategoriesStepDef {
    Categories category=new Categories();
    @Given("user click on computer category")
    public void Category(){
        category.computer_category().click();
    }
    @Given("user choose sub categories like a notebooks")
    public void sub_Category(){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/notebooks");

    }
}
