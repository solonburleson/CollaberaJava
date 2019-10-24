package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

	public static void main(String[] args) {
		ArrayList<String> list_Strings = new ArrayList<String>();
		
		list_Strings.add("Red");
		list_Strings.add("Green");
		list_Strings.add("Orange");
		list_Strings.add("White");
		list_Strings.add("Black");
		
		System.out.println("list before shuffling: " + list_Strings);
		Collections.shuffle(list_Strings);
		System.out.println("list after shuffling: " + list_Strings);
	}

}
