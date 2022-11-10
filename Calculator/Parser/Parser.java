package Calculator.Parser;

import Calculator.Function.Addition;
import Calculator.Function.Division;
import Calculator.Function.Exponentiation;
import Calculator.Function.Function;
import Calculator.Function.Multiplication;
import Calculator.Function.Negation;
import Calculator.Function.Number;
import Calculator.Function.Subtraction;
import Calculator.Function.Variable;
import Calculator.Parser.Scanner.Scanner;
import Calculator.Parser.Scanner.Token;
import Calculator.Parser.Scanner.TokenType;

public class Parser {
	
	public static Function parse(String input) {
		Scanner scanner = new Scanner(input);
		
		return parseAdditiveExpression(scanner);
	}
	
	private static Function parseAdditiveExpression(Scanner scanner) {
		Function left = parseMultiplicativeExpression(scanner);
		Token token = scanner.nextToken();
		while (true) {
			switch (token.getType()) {
			case PLUS_OP:
				left = new Addition(left, parseMultiplicativeExpression(scanner));
				token = scanner.nextToken();
				break;
			case MINUS_OP:
				left = new Subtraction(left, parseMultiplicativeExpression(scanner));
				token = scanner.nextToken();
				break;
			default:
				scanner.pushBack(token);
				return left;
			}
		}
	}
	
	private static Function parseMultiplicativeExpression(Scanner scanner) {
		Function left = parseExponentiationExpression(scanner);
		Token token = scanner.nextToken();
		while (true) {
			switch (token.getType()) {
			case MULT_OP:
				left = new Multiplication(left, parseExponentiationExpression(scanner));
				token = scanner.nextToken();
				break;
			case DIV_OP:
				left = new Division(left, parseExponentiationExpression(scanner));
				token = scanner.nextToken();
				break;
			default:
				scanner.pushBack(token);
				return left;
			}
		}
		//throw new UnsupportedOperationException();
	}
	
	private static Function parseExponentiationExpression(Scanner scanner) {
		Function left = parseElementaryExpression(scanner);
		Token token = scanner.nextToken();
		if (token.getType() == TokenType.EXP_OP) {
			left = new Exponentiation(left, parseExponentiationExpression(scanner));
		} else {
			scanner.pushBack(token);
		}
		return left;
	}
	
	private static Function parseElementaryExpression(Scanner scanner) {
		Token token = scanner.nextToken();
		switch (token.getType()) {
		case NUMBER:
			return new Number(Double.parseDouble(token.getContent()));
		case IDENTIFIER:
			return new Variable(token.getContent());
		case MINUS_OP:
			return new Negation(parseElementaryExpression(scanner));
		case LEFT_PAR:
			Function result = parseAdditiveExpression(scanner);
			if (scanner.nextToken().getType() != TokenType.RIGHT_PAR) {
				throw new UnsupportedOperationException();
			}
			return result;
		default:
			throw new UnsupportedOperationException();
		}
	}
	
}
