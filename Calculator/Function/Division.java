package Calculator.Function;

import java.util.Map;

public class Division extends BinaryOperation {
	
	public Division(Function left, Function right) {
		super(left, right);
	}
	
	@Override
	public double evaluate(Map<String, Double> assignments) {
		double result = 0;
		try{
			result = left.evaluate(assignments) / right.evaluate(assignments);
		} catch (ArithmeticException e) {
			System.err.println("Arithmetic Exception: Division by zero");
		}
		return result;
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " / " + right.toString() + ")";
		// throw new UnsupportedOperationException();
	}
	
}
