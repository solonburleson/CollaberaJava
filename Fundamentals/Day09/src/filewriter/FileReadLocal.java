package filewriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReadLocal {

	public static void main(String[] args) throws IOException {
		File file = new File("test.txt");
		
		FileInputStream fis = new FileInputStream(file);
		
		int data = fis.read();
		while(data != -1) {
			System.out.println((char)data);
			data = fis.read();
		}
		
		fis.close();
	}
}
