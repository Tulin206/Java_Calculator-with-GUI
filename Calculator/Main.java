package Calculator;

import javax.swing.SwingUtilities;

import Calculator.UI.CalculatorController;
import Calculator.UI.CalculatorUI;

public class Main {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				CalculatorUI ui = new CalculatorUI();
				new CalculatorController(ui);
			}
		});
	}
	
}
