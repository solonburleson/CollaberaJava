package MultiArray;

import java.util.Arrays;

public class CloneArray {

	public static void main(String[] args) {
		int[] arr = {33,3,4,5};
		System.out.println("Printing original array:");
		System.out.println(Arrays.toString(arr));
		
//		for(int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		System.out.println("Printing clone of the array:");
		int carr[] = arr.clone();
		System.out.println(Arrays.toString(carr));
		
//		for(int i = 0; i < carr.length; i++) {
//			System.out.println(carr[i]);
//		}
		
		System.out.println("Are both equal?");
		System.out.println(arr == carr);
		System.out.println(arr);
		System.out.println(carr);
	}

}
