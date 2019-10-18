package MultiArray;

public class MatricesAdd {

	public static void main(String[] args) {
		int a[][] = {{1,3,4},{3,4,5}};
		int b[][] = {{1,3,4},{3,4,5}};

		addMatrices(a,b);
		
		int[][] arr1 = {{1,1,1},{2,2,2},{3,3,3}};
		int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};
		matrixMultiplication(arr1,arr2);
	}
	
	public static void addMatrices(int[][] a, int[][] b) {
		int c[][] = new int[a.length][a[0].length];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void matrixMultiplication(int[][] a, int[][] b) {
		int c[][] = new int[a.length][a[0].length];
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				for(int k = 0; k < c.length; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
