package Calculator.UI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.HashMap;

import javax.swing.JButton;

import Calculator.Function.Function;
import Calculator.Parser.Parser;

public class CalculatorController implements ActionListener { 
	
	private static final String ACT_RESULT = "result";
	private static final String ACT_CLEAR = "clear";
	
	private CalculatorUI ui;
	// private JButton btn0;
	// private JButton btn1;
	// private JButton btn2;
	// private JButton btn3;
	// private JButton btn4;
	// private JButton btn5;
	// private JButton btn6;
	// private JButton btn7;
	// private JButton btn8;
	// private JButton btn9;
	// private JButton btnPlus;
	// private JButton btnMinus;
	// private JButton btnDivide;
	// private JButton btnMultiply;
	// private JButton btnClear;
	// private JButton btnDot;
	// private JButton btnEquals;
	// private JButton btnPower;
	// private JButton btnLeftPar;
	// private JButton btnRightPar;
	
	public CalculatorController(CalculatorUI ui) {
		this.ui = ui;
		for (Component btn : ui.getPnlButton().getComponents()){
			((JButton)btn).addActionListener(this);
		}
		 
		// btn0 = ui.getBtn0();
		// btn1 = ui.getBtn1();
		// btn2 = ui.getBtn2();
		// btn3 = ui.getBtn3();
		// btn4 = ui.getBtn4();
		// btn5 = ui.getBtn5();
		// btn6 = ui.getBtn6();
		// btn7 = ui.getBtn7();
		// btn8 = ui.getBtn8();
		// btn9 = ui.getBtn9();
		// btnPlus = ui.getBtnPlus();
		// btnMinus = ui.getBtnMinus();
		// btnDivide = ui.getBtnDivide();
		// btnMultiply = ui.getBtnMultiply();
		// btnClear = ui.getBtnClear();
		// btnDot = ui.getBtnDot();
		// btnEquals = ui.getBtnEquals();
		// btnPower = ui.getBtnPower();
		// btnLeftPar = ui.getBtnLeftPar();
		// btnRightPar = ui.getBtnRightPar();
		
		
		// ui.getBtn0().addActionListener(this);
		// ui.getBtn1().addActionListener(this);
		// ui.getBtn2().addActionListener(this);
		// ui.getBtn3().addActionListener(this);
		// ui.getBtn4().addActionListener(this);
		// ui.getBtn5().addActionListener(this);
		// ui.getBtn6().addActionListener(this);
		// ui.getBtn7().addActionListener(this);
		// ui.getBtn8().addActionListener(this);
		// ui.getBtn9().addActionListener(this);
		// ui.getBtnPlus().addActionListener(this);
		// ui.getBtnMinus().addActionListener(this);
		// ui.getBtnDivide().addActionListener(this);
		// ui.getBtnMultiply().addActionListener(this);
		// ui.getBtnClear().addActionListener(this);
		// ui.getBtnDot().addActionListener(this);
		// ui.getBtnEquals().addActionListener(this);
		// ui.getBtnPower().addActionListener(this);
		// ui.getBtnLeftPar().addActionListener(this);
		// ui.getBtnRightPar().addActionListener(this);

		// ui.getBtnEquals().setActionCommand(ACT_RESULT);
		// ui.getBtnClear().setActionCommand(ACT_CLEAR);
		
	}

	@Override
	public void actionPerformed(ActionEvent act) {
		String btnLabel = ((JButton)act.getSource()).getText();
		Function inputFunction;
		switch (btnLabel){
		// switch (act.getActionCommand()) {
			case "C":
			// case ACT_CLEAR:
			ui.clearFormula();
			break;

			case "=":
			// case ACT_RESULT:
			try {
				inputFunction = Parser.parse(ui.getFormula());
			} catch (UnsupportedOperationException e) {
				System.err.println("ERROR: Invalid input");
				break;
			}

			try {
				double value = inputFunction.evaluate(new HashMap<>());
				this.ui.setFormula(String.valueOf(value));
			} catch (Exception e){
					System.err.println(e.getMessage());
					break;
			}
			break;

			default:
			// add text to txtFormula for all other buttons except C and =
			this.ui.setFormula(this.ui.getFormula() + btnLabel);
			// this.ui.setFormula(this.ui.getFormula() + act.getActionCommand());
		//}
		}
	}
}
