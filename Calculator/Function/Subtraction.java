package Calculator.Function;

import java.util.Map;

public class Subtraction extends BinaryOperation {
	
	public Subtraction(Function left, Function right) {
		super(left, right);
	}
	
	@Override
	public double evaluate(Map<String, Double> assignments) {
		return (left.evaluate(assignments) - right.evaluate(assignments));
		// throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		return "(" + left.toString() + " - " + right.toString() + ")";
		// throw new UnsupportedOperationException();
	}
	
}
