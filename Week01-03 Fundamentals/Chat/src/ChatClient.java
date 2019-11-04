
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient implements ActionListener, WindowListener {

	private JTextField tf;
	private JTextArea ta;
	private Socket mySocket;
	private BufferedReader in;
	private PrintWriter out;
	
	public volatile static int numChatClients=0;
	public boolean logging = false;
	
	public ChatClient(String host, int port, JFrame frame, JTextArea ta, JTextField tf, JButton sb) throws IOException {
		this.tf=tf;
		this.ta=ta;
		
		this.mySocket=new Socket(host,port);
		in = new BufferedReader(new InputStreamReader(mySocket.getInputStream()));
		out = new PrintWriter(mySocket.getOutputStream());
		
		inthread = new InThread();
		inthread.start();
		
		sb.addActionListener(this);
	}
	
	private InThread inthread; 
	
	private void startThread() {
		numChatClients++;
		inthread = new InThread();
		inthread.start();
	}
	private void stopThread() {
		inthread.done=true;
		numChatClients--;
	}
	
	public class InThread extends Thread{
		private volatile boolean done = false;
		
		@Override
		public void run() {
			
			String cmd;
			try {
				while(!done) {
					cmd = in.readLine();
					if(cmd==null)
						break;
					
					ta.append(cmd+"\n");
					System.out.println(cmd);
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("ending client thread");
		}
	}
	
	
/**********************************************
 * 	                Listeners                 *
 **********************************************/
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Send")) {
			if(tf.getText().equals(""))
				return;
			out.println(tf.getText());
			out.flush();
			//System.out.println(tf.getText());
			tf.setText("");
		}
	}

	
	@Override
	public void windowClosed(WindowEvent e) {
		try {
			this.mySocket.close();
		}catch(IOException ex) {}
		System.exit(0);
	}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowOpened(WindowEvent e) {}
	
	public static void main(String[] args) {
		startClientGUI(args[0],9876,JFrame.EXIT_ON_CLOSE);
	}
	
	public static boolean startClientGUI(String host, int port, int closeOp) {
		JFrame frame = new JFrame("Chat");
		JTextArea ta = new JTextArea();
		JTextField tf = new JTextField();
		JButton sb = new JButton("Send");
		
		
		ta.setEditable(false);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(ta);
		
		Container c = new Container();
		c.setLayout(new GridLayout(2,1));
		c.add(tf);
		c.add(sb);
		
		frame.getContentPane().add(c, BorderLayout.SOUTH);
		
		ChatClient client;
		try {
			client = new ChatClient(host,port,frame,ta,tf,sb);
			frame.setDefaultCloseOperation(closeOp);
			frame.setSize(500, 500);
			frame.setVisible(true);
		}catch(IOException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
