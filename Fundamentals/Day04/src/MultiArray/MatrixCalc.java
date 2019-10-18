package MultiArray;

public class MatrixCalc {

	public static void main(String[] args) {
		int arr[][] = {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};
		
		maxInRows(arr);
		
		System.out.println("-------------------");
		
		columnSum(arr);
	}
	
	public static void maxInRows(int[][] arr) {
		int max;
		for(int i = 0; i < arr.length; i++) {
			max = arr[i][0];
			for(int j = 0; j < arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
				}
			}
			System.out.println("Max element of row " + i + " is " + max);
		}
	}

	public static void columnSum(int[][] arr) {
		int sum;
		for(int i = 0; i < arr[i].length; i++) {
			sum = 0;
			for(int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			System.out.println("Sum of column " + i + " is " + sum);
		}
	}
}
