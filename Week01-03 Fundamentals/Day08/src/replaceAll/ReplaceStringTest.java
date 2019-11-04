package replaceAll;

import javax.swing.JOptionPane;

public class ReplaceStringTest {

	public static void main(String[] args) {
		char letter;
		String inSentence = JOptionPane.showInputDialog(null, "Sentence:");
//		StringBuffer tempStringBuffer = new StringBuffer(inSentence);
//		int numberOfCharacters = tempStringBuffer.length();
//
//		for(int i = 0; i < numberOfCharacters; i++) {
//			letter = tempStringBuffer.charAt(i);
//			if(		letter == 'a' || letter =='A' || 
//					letter == 'e' || letter =='E' || 
//					letter == 'i' || letter == 'I' ||
//					letter == 'o' || letter == 'O' ||
//					letter == 'u' || letter == 'U') {
//				tempStringBuffer.setCharAt(i, 'X');
//			}
//		}
		
		String replaced = inSentence.replaceAll("[aeiouAEIOU]", "X");
		JOptionPane.showMessageDialog(null, replaced);
	}

}
