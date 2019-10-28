package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculatorActionListener implements ActionListener{
	String value1, value2;
	String operator;

	private JTextField textField;

	public CalculatorActionListener(JTextField textField) {
		this.textField = textField;
		clearEntries();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent: " + e.getActionCommand());
		//switch (e.getActionCommand()) {
		// ...
		switch (e.getActionCommand()) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				textField.setText(textField.getText() + e.getActionCommand());
				break;
			case "+":
			case "-":
			case "/":
			case "x":
			case "%":
				value1 = textField.getText();
				operator = e.getActionCommand();
				textField.setText("");
				break;
			case "=":
				value2 = textField.getText();
				String resultStr = "" + compute(value1,value2,operator);
				textField.setText(resultStr);
				clearEntries();
				break;
			case "C":
				clearEntries();
				textField.setText("");
				break;
			case "U":
				String negStr = textField.getText();
				if(negStr.charAt(0) != '-') {
					negStr = "-" + negStr;
				} else {
					String temp = "";
					for(int i = 1; i < negStr.length(); i++) {
						temp += negStr.charAt(i);
					}
					negStr = temp;
				}
				textField.setText(negStr);
		}
	}
	public JTextField getTextField() {
		return textField;
	}
	public void setTextField(JTextField textField) {
		this.textField = textField;
	}
	
	private int compute(String value1, String value2, String operator) {
		int v1 = Integer.parseInt(value1);
		int v2 = Integer.parseInt(value2);
		int result = 0;
		
		switch(operator) {
			case "+":
				result = v1 + v2;
				break;
			case "-":
				result = v1 - v2;
				break;
			case "x":
				result = v1 * v2;
				break;
			case "/":
				result = v1 / v2;
				break;
			case "%":
				result = v1 % v2;
				break;
		}
		
		return result;
	}
	
	private void clearEntries() {
		this.value1 = null;
		this.value2 = null;
		this.operator = null;
	}
}