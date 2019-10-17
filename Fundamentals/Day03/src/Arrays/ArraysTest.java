package Arrays;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		commonElements();
	}
	
	public static void commonElements() {
		int[] array1 = {1,2,5,5,8,9,7,10};
		int[] array2 = {0,1,6,15,6,4,7,0};
		
		System.out.println("Array 1: " + Arrays.toString(array1));
		System.out.println("Array 2: " + Arrays.toString(array2));
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j]) {
					System.out.println("Common element: " + array1[i]);
				}
			}
		}
	}

}
