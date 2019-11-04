package swing;

import java.awt.BorderLayout;

import javax.swing.*;

public class ChatGUI {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);
		
		JMenuBar mb = new JMenuBar();
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("Help");
		mb.add(m1);
		mb.add(m2);
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m12 = new JMenuItem("Close");
		m1.add(m11);
		m1.add(m12);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Enter Text");
		JTextField tf = new JTextField(10);
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		JTextArea ta = new JTextArea();
		
		frame.getContentPane().add(BorderLayout.SOUTH, panel);
		frame.getContentPane().add(BorderLayout.NORTH, mb);
		frame.getContentPane().add(BorderLayout.CENTER, ta);
		frame.setVisible(true);
	}

}
