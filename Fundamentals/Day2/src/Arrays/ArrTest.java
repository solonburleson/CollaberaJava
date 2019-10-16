package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrTest {

	public static void main(String[] args) {
//		rainfall();
		copyArr();
		findDuplicates();
	}
	
	public static void rainfall() {
		Scanner scanner = new Scanner(System.in);
		double[] rainfall = new double[12];
		String[] monthName = new String[12];
		monthName[0] = "January";
		monthName[1] = "February";
		monthName[2] = "March";
		monthName[3] = "April";
		monthName[4] = "May";
		monthName[5] = "June";
		monthName[6] = "July";
		monthName[7] = "August";
		monthName[8] = "September";
		monthName[9] = "October";
		monthName[10] = "November";
		monthName[11] = "December";
//		String[] monthName = {"January", "February", "March", "April", "May", "June","July", "August","September","November","December"};
		
		double annualAverage, sum = 0.0;
		
		for(int i = 0; i < rainfall.length; i++) {
			System.out.print("Rainfall for " + monthName[i] + ": " );
			rainfall[i] = scanner.nextDouble();
			sum += rainfall[i];
		}
		annualAverage = sum/rainfall.length;
		
		double[] quarterAverage = new double[4];
		for(int i = 0; i < 4; i++) {
			sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += rainfall[3*i + j];
			}
			quarterAverage[i] = sum / 3.0;
		}
		
		System.out.println("Annual Average: " + annualAverage);
		for(int i = 0; i < quarterAverage.length; i++) {
			System.out.println("Quarter " + (i+1) + " average rainfall: " + quarterAverage[i]);
		}
		scanner.close();
	}
	
	public static void copyArr() {
		int[] my_array = {25,14,56,15,36,56,77,18,29,49};
		int[] new_array = new int[10];
		
		for(int i = 0; i < new_array.length; i++) {
			new_array[i] = my_array[i];
		}
		
		System.out.println("Source Array: " + Arrays.toString(my_array));
		System.out.println("New Array: " + Arrays.toString(new_array));
	}
	
	public static void findDuplicates() {
		int[] my_array = {1,2,5,5,6,6,7,2};
		
		for(int i = 0; i < my_array.length-1; i++) {
			for(int j = i + 1; j < my_array.length; j++) {
				if(my_array[i] == my_array[j]) {
					System.out.println("Duplicate Element: " + my_array[i]);
				}
			}
			System.out.println(my_array[i]);
		}
	}
}
