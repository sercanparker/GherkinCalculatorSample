package CucumberGherkinCalculatorSample.CucumberGherkinCalculatorSample;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SumSteps {
	
	private Calculator calculator = null;
	
	@When("^I enter two positive number as (\\d+) and (\\d+)$")
	public void i_enter_two_positive_number_as_and(int arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // throw new PendingException();
		calculator.Sum(arg1, arg2);
		
	}

	@Then("^The number represented on screen is (\\d+)\\.$")
	public void the_number_represented_on_screen_is(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		Assert.assertEquals(arg1, calculator.getNumberOnScreen());
		
	}
	
	@Given("^The board is:$")
	public void the_board_is(Map<String,Integer> arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    //throw new PendingException();
		Assert.assertEquals(1,(long)arg1.get("Parker"));
	}
	
	@Given("^Create a calculator$")
	public void create_a_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    calculator = new Calculator();
	}
}
