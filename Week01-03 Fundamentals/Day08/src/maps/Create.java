package maps;

import java.util.HashMap;
import java.util.Map;

public class Create {

	public static void main(String[] args) {
		HashMap<Integer,String> hash_map = new HashMap<Integer,String>();

		hash_map.put(1, "Red");
		hash_map.put(2, "Green");
		hash_map.put(3, "Black");
		hash_map.put(4, "White");
		hash_map.put(5, "Blue");
		System.out.println("Size of the hashmap: " + hash_map.size());
		for(Map.Entry k : hash_map.entrySet()) {
			System.out.println(k.getKey() + " " + k.getValue());
		}
		
		hash_map.clear();
		System.out.println("The new map: " + hash_map);
	}

}
