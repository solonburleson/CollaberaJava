package MultiArray;

public class AnonArray {

	public static void main(String[] args) {
		printArray(new int[] {10,22,44,66});
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
