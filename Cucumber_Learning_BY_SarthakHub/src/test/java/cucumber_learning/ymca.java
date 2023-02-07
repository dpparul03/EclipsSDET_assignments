package cucumber_learning;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ymca {
	  @Given("I am interested in learning YMCA")
	  public void i_am() {
		  System.out.println("I am interested in learning YMCA");
	  }
	  
	  
	  @And("I went online to find diffrent YMCA")
	  
	  public void i_went() {
		  System.out.println("I went online to find diffrent YMCA");
	  }
	  
	  @And("I shortlisted 4 YMCA Gym near my place")
	  
	  public void i_shortlisted() {
		  System.out.println("I shortlisted 4 YMCA Gym near my place");
	  }
	  
	  
	  @When("I enquired about one Gym closet to my place they ask me to come and have look")
	  public void i_enquired () {
		  System.out.println("I enquired about one Gym closet to my place they ask me to come and have look");
	  }
	  
	  
	  @And("I deceided to vissit them")
	  public void i_deceided() {
		  System.out.println("I deceided to vissit them");
	  }
	  
	  
	  @When("I went to vissit the Gymn on 30 Sep")
	  public void i_wentto() {
		  System.out.println("I went to vissit the Gymn on 30 Sep");
	  }
	  
	  
	  @And("I decided to book membership")
	  public void i_decided() {
		  System.out.println("I decided to book membership");
	  }
	  
	  
	  @But("I decided to keep a trainner")
	  public void i_decidedto() {
		  System.out.println("I decided to keep a trainner");
	  }
	  
	  
	  @Then("I bargained and recveived a discount")
	  public void i_bargained () {
		  System.out.println("I bargained and recveived a discount");
	  }

}
