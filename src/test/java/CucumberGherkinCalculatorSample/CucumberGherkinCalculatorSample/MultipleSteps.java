package CucumberGherkinCalculatorSample.CucumberGherkinCalculatorSample;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleSteps {
	
	
	private Calculator calculator = null;
	
	@When("^multiple positive number with zero$")
	public void multiple_positive_number_with_zero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		calculator.Multiple(0,5);
	}

	@Then("^result is going to be zero\\.$")
	public void result_is_going_to_be_zero() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(0, calculator.getNumberOnScreen());
	}

	@Given("^create a calculator$")
	public void create_a_calculator() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    calculator = new Calculator();
	}
}
