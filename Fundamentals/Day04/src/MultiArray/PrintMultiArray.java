package MultiArray;

public class PrintMultiArray {

	public static void main(String[] args) {
		int[][] arr = {{1,3,5},{2,4,6},{3,4,5},{1,4,7}};

		printMultiArray(arr);
	}
	
	public static void printMultiArray(int[][] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
