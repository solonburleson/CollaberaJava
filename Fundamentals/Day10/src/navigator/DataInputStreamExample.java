package navigator;

import java.io.*;

public class DataInputStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("data.dat");
		FileInputStream fis = new FileInputStream(file);
		DataInputStream dis = new DataInputStream(fis);
		
		int data = dis.readInt();
		System.out.println("Data Read: " + data);
		System.out.println("Data Read: " + dis.readBoolean());
		System.out.println("Data Read: " + dis.readChar());
		
		dis.close();
		fis.close();
	}

}
