package Calculator.UI;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Calculator.Parser.Parser;

public class CalculatorUI extends JFrame {
	
	private static final int SPACING = 20;
	

	private JTextField txtFormula;
	JPanel pnlButtons;


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


	public CalculatorUI() {
		JPanel pnlContent = new JPanel();
		pnlContent.setLayout(new BoxLayout(pnlContent, BoxLayout.Y_AXIS));
		pnlContent.setBorder(BorderFactory.createEmptyBorder(SPACING, SPACING, SPACING, SPACING));
		
		
		txtFormula = new JTextField(12);
		txtFormula.setEditable(false);

		// add text area on Jpanel
		pnlContent.add(txtFormula);
		
		pnlButtons = new JPanel();
		pnlButtons.setLayout(new GridLayout(4, 5));


		String [] buttons = new String [] {"7", "8", "9", "C", "=",
											"4", "5", "6", "*", "/",
											"1", "2", "3", "+", "-",
											"0", ".", "^", "(", ")"};

		for (String button : buttons) {
			JButton btn = new JButton(button);
			pnlButtons.add(btn);
		}

		// btn0 = new JButton("0");
		// btn1 = new JButton("1");
		// btn2 = new JButton("2");
		// btn3 = new JButton("3");
		// btn4 = new JButton("4");
		// btn5 = new JButton("5");
		// btn6 = new JButton("6");
		// btn7 = new JButton("7");
		// btn8 = new JButton("8");
		// btn9 = new JButton("9");
		// btnPlus = new JButton("+");
		// btnMinus = new JButton("-");
		// btnDivide = new JButton("/");
		// btnMultiply = new JButton("*");
		// btnClear = new JButton("C");
		// btnDot = new JButton(".");
		// btnEquals = new JButton("=");
		// btnPower = new JButton("^");
		// btnLeftPar = new JButton("(");
		// btnRightPar = new JButton(")");


		// pnlButtons.add(btn7);
		// pnlButtons.add(btn8);
		// pnlButtons.add(btn9);
		// pnlButtons.add(btnClear);
		// pnlButtons.add(btnEquals);

		// pnlButtons.add(btn4);
		// pnlButtons.add(btn5);
		// pnlButtons.add(btn6);
		// pnlButtons.add(btnMultiply);
		// pnlButtons.add(btnDivide);

		// pnlButtons.add(btn1);
		// pnlButtons.add(btn2);
		// pnlButtons.add(btn3);
		// pnlButtons.add(btnPlus);
		// pnlButtons.add(btnMinus);
		
		// pnlButtons.add(btn0);
		// pnlButtons.add(btnDot);
		// pnlButtons.add(btnPower);
		// pnlButtons.add(btnLeftPar);
		// pnlButtons.add(btnRightPar);

		// add buttons to the Jpanel
		pnlContent.add(pnlButtons);

		// add Jpanel on JFrame
		setContentPane(pnlContent);
		
		setTitle("Calculator");
		pack();
		setResizable(false);
		setLocationByPlatform(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
	// to retrieve the swing componenet representing the input field
	public JTextField getTxtInput(){
		return this.txtFormula;
	}

	// get the property of the input field (text)
	public String getFormula() {
		return txtFormula.getText();
	}


	// to modify the text of the input field
	public void setFormula(String text) {
		txtFormula.setText(text);
	}
	

	public void clearFormula() {
		txtFormula.setText("");
	}

	// to get the layout of the panel of buttons
	public JPanel getPnlButton(){
		return this.pnlButtons;
	}

	
// 	public JButton getBtn0() {
// 		return btn0;
// 	}


// 	public JButton getBtn1() {
// 		return btn1;
// 	}


// 	public JButton getBtn2() {
// 		return btn2;
// 	}


// 	public JButton getBtn3() {
// 		return btn3;
// 	}


// 	public JButton getBtn4() {
// 		return btn4;
// 	}


// 	public JButton getBtn5() {
// 		return btn5;
// 	}


// 	public JButton getBtn6() {
// 		return btn6;
// 	}


// 	public JButton getBtn7() {
// 		return btn7;
// 	}


// 	public JButton getBtn8() {
// 		return btn8;
// 	}


// 	public JButton getBtn9() {
// 		return btn9;
// 	}


// 	public JButton getBtnPlus() {
// 		return btnPlus;
// 	}


// 	public JButton getBtnMinus() {
// 		return btnMinus;
// 	}


// 	public JButton getBtnLeftPar() {
// 		return btnLeftPar;
// 	}


// 	public JButton getBtnRightPar() {
// 		return btnRightPar;
// 	}


// 	public JButton getBtnDivide() {
// 		return btnDivide;
// 	}


// 	public JButton getBtnMultiply() {
// 		return btnMultiply;
// 	}


// 	public JButton getBtnDot() {
// 		return btnDot;
// 	}


// 	public JButton getBtnEquals() {
// 		return btnEquals;
// 	}


// 	public JButton getBtnPower() {
// 		return btnPower;
// 	}


// 	public JButton getBtnClear() {
// 		return btnClear;
// 	}
}
