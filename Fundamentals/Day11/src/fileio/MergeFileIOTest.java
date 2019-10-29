package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

public class MergeFileIOTest {

	public static void main(String[] args)  throws IOException  {
		File input1 = new File("file1.txt");
		File input2 = new File("file2.txt");
		
		Set<String> mergeSet = new HashSet<String>();
		
		FileReader fr1 = new FileReader(input1);
		FileReader fr2 = new FileReader(input2);
		
		BufferedReader br1 = new BufferedReader(fr1);
		BufferedReader br2 = new BufferedReader(fr2);
		
		PrintWriter pw = new PrintWriter("mergeoutput.txt");
		
		String str1 = br1.readLine();
		String str2 = br2.readLine();
		
		while(str1 != null || str2 != null) {
			if(str1 != null && mergeSet.add(str1)) {
				pw.println(str1);
			}
			if(str2 != null && mergeSet.add(str2)) {
				pw.println(str2);
			}
			str1 = br1.readLine();
			str2 = br2.readLine();
		}
		
		pw.flush();
		br1.close();
		br2.close();
		pw.close();
	}

}
