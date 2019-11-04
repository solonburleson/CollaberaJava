package optionpane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OptionPaneTest {

	JFrame f;

	OptionPaneTest(){
		f = new JFrame();
	}
	
	void showMessage(String msg) {
		JOptionPane.showMessageDialog(f, msg);
	}
	
	public static void main(String[] args) {
		OptionPaneTest obj = new OptionPaneTest();
		String m = JOptionPane.showInputDialog("Your input:", "Enter your input here");
		System.out.println(m);
		obj.showMessage("Custom message: " + m);
	}

}
