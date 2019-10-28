package navigator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		File file  = new File("Data.txt");
//		FileOutputStream fos = new FileOutputStream(file);
//		PrintWriter pw = new PrintWriter(fos);
		
		PrintWriter pw = new PrintWriter(file);
		
		ArrayList<String> names = new ArrayList<>();
		for(int i = 0; i < 10; i++) {
			names.add("name" + i);
		}
		System.out.println("name: " + names);
		pw.println(names);
		
		HashMap<Integer,String> hashMapOfNames = new HashMap<Integer,String>();
		for(int i = 0; i < 10; i++) {
			hashMapOfNames.put(i, "name" + i);
		}
		System.out.println("hashMapOfNames: " + hashMapOfNames);
		pw.println(hashMapOfNames);
		pw.close();
	}

}
