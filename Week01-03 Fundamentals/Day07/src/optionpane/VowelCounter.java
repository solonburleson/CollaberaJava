package optionpane;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class VowelCounter {

	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		OptionPaneTest obj = new OptionPaneTest();
		String name = JOptionPane.showInputDialog("Your name:", "Enter your name here");
		System.out.println(name);
		int count = 0;
		for(int i = 0; i < name.length(); i++) {
			char letter = name.charAt(i);
			if(		letter == 'a' || letter =='A' || 
					letter == 'e' || letter =='E' || 
					letter == 'i' || letter == 'I' ||
					letter == 'o' || letter == 'O' ||
					letter == 'u' || letter == 'U') {
				count++;
			}
		}
		System.out.println(count);
		String msg = name + ", your name has " + count + " vowels";
		JOptionPane.showMessageDialog(f, msg);
	}

}
