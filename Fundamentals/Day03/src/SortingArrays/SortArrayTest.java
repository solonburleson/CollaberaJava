package SortingArrays;

import java.util.Arrays;

public class SortArrayTest {

	public static void main(String[] args) {
		int[] myArray = {45,12,85,32,89,39,69,44,42,1,6,8};
		
//		sortArray(myArray);
		minMaxDiff(myArray);
	}
	
	public static void sortArray(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[idx]) {
					idx = j;
				}
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public static void minMaxDiff(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.print("Minimum = " + min +"\nMaximum = " + max + "\nDifference = " + (max - min));
	}

}
