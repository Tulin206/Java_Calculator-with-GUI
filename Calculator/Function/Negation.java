package Calculator.Function;

import java.util.Map;

public class Negation extends UnaryOperation {
	
	public Negation(Function operator) {
		super(operator);
	}
	
	@Override
	public double evaluate(Map<String, Double> assignments) {
		return operator.evaluate(assignments) * -1;
		// throw new UnsupportedOperationException();
	}
	
	@Override
	public String toString() {
		return "(-" + operator.toString() + ")";
		// throw new UnsupportedOperationException();
	}
	
}
