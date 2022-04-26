package step_Definitions;

import Pages.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class B03_SearchStepDef {
    Search search=new Search();
    @Given("user clicks on search field")
    public void user_clicks_on_search_field() {
        search.search_field().click();

    }
    @When("user search with name of product")
    public void user_search_with_name_of_product()
    {
        search.name_product().sendKeys("laptop");
        search.searchBtn().click();

    }
    @Then("user could find relative results")
    public void user_could_find_relative_results()
    {
        int count = search.Result().size();
        System.out.println(count);
        Assert.assertTrue(count > 0);

        for (int x = 0; x < count ; x++) {
            System.out.println(search.Result().get(x).getText());
            Assert.assertTrue(search.Result().get(x).getText().toLowerCase().contains("laptop"));
        }
    }

}
