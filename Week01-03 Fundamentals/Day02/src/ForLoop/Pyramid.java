package ForLoop;

public class Pyramid {

	public static void main(String[] args) {
		pyramid1(8);
		System.out.println();
		pyramid2(8);
	}
	
	public static void pyramid1(int lines) {
		for(int i = 1; i <= lines; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pyramid2(int lines) {
		for(int i = lines; i >= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
