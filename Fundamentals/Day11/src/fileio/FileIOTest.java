package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class FileIOTest {

	public static void main(String[] args) throws IOException {
		File input = new File("input.txt");
		File output = new File("output.txt");
		
		Set<String> removeDupes = new HashSet<String>();
		
		FileReader fr = new FileReader(input);
		BufferedReader br = new BufferedReader(fr);
		PrintWriter pw = new PrintWriter(output);
		
		String str = br.readLine();
		
		while(str != null) {
			if(removeDupes.add(str)) {
				pw.println(str);
			}
			str = br.readLine();
		}
		
//		try {
//			FileReader fr = new FileReader(input);
//			BufferedReader br = new BufferedReader(fr);
//			 String str = br.readLine();
//			 
//			 while(str != null) {
//				 removeDupes.add(str);
//				 str = br.readLine();
//			 }
//			 
//			 br.close();
//		} catch(FileNotFoundException e) {
//			System.out.println("FileNotFoundException: " + e.getMessage());
//		}
//		
//		System.out.println(removeDupes);
//		
//		PrintWriter pw = new PrintWriter(output);
//		for(String str : removeDupes) {
//			pw.println(str);
//		}
		
		pw.flush();
		br.close();
		pw.close();
	}
}
