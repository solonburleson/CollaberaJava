package WhileLoop;

import java.util.Scanner;

public class WhileTest {

	public static void main(String[] args) {
		whileTest1();
		whileTest2();
		whileTest3();
		loopandHalf();
	}
	
	public static void whileTest1() {
		int result = 0;
		double cnt = 1.0;
		
		while(cnt <= 10.0) {
			cnt += 1.0;
			result++;
		}
		System.out.println(result);
	}
	
	public static void whileTest2() {
		int result = 0;
		double cnt = 0.0;
		
		while(cnt <= 1.0) {
			cnt += 0.1;
			result++;
		}
		System.out.println(result);
	}
	
	public static void whileTest3() {
		for(int i = 0; i < 10; i++) {
			System.out.print(i);
		}
		
		int n = 0;
		
		while(n < 10) {
			System.out.print(n);
			n++;
		}
	}
	
	public static void loopandHalf() {
		String name;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Your name: ");
			name = scanner.nextLine();
			
			if(name.length() > 0) {
				break;
			}
			
			System.out.println("Invalid Entry." + "You must enter at least one character.");
		}
		scanner.close();
	}

}
