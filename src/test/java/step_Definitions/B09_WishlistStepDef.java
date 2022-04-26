package step_Definitions;

import Pages.Wishlist;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class B09_WishlistStepDef {
    Wishlist list=new Wishlist();
    @Given("user click on Books category")
    public void Books_category(){
        list.BooksCategory().click();
    }
    @When("user add different products to wishlist")
    public void wishlist_product()throws InterruptedException{
        list.wishlistProduct1().click();
        Thread.sleep(4000);
        list.wishlistProduct2().click();
    }
    @And("user go to Wishlist")
    public void Wishlist()throws InterruptedException{
       list.wishlist().click();
        Thread.sleep(5000);
    }
    @Then("count numbers of quantities")
    public void Quantities(){
        String Firstrow= list.Numbers_of_quantities().get(0).getAttribute("value");
        System.out.println(Firstrow);

        String Scandtrow=  list.Numbers_of_quantities().get(1).getAttribute("value");
        System.out.println(Scandtrow);

        int total = Integer.parseInt(Firstrow) + Integer.parseInt(Scandtrow);
        System.out.println(total);
    }
}
