package hashset;

import java.util.*;

public class Iterate {

	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<String>();
		
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		
		h_set.remove("Pink");
		Iterator<String> p = h_set.iterator();
		
		while(p.hasNext()) {
			System.out.println(p.next());
		}
	}

}
