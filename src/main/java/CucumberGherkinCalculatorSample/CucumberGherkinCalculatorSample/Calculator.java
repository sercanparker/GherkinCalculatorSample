package CucumberGherkinCalculatorSample.CucumberGherkinCalculatorSample;

public class Calculator {

	private int numberOnScreen;
	
	
	public void Sum(int number1,int number2) {
		 int sum = number1 + number2;
		 setNumberOnScreen(sum);
	}

	public int getNumberOnScreen() {
		return numberOnScreen;
	}

	private void setNumberOnScreen(int numberOnScreen) {
		this.numberOnScreen = numberOnScreen;
	}
	
	
}
