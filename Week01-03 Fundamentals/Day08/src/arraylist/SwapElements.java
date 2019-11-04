package arraylist;

import java.util.ArrayList;

public class SwapElements {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Green");
		colors.add("Orange");
		colors.add("White");
		colors.add("Black");

		System.out.println("Array list before Swap: ");
		for(String c : colors) {
			System.out.println(c);
		}
	}

}
