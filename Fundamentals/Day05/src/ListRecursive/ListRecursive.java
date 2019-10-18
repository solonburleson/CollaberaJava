package ListRecursive;

public class ListRecursive {

	public static void main(String[] args) {
		listNumbers(1,100);
	}
	
	public static void listNumbers(int x, int y) {
		System.out.print(x + " ");
		
		if(x == y) {
			return;
		}
		
		listNumbers(x + 1, y);
	}

}
