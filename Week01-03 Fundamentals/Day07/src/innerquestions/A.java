package innerquestions;

public class A {
	static String z  = "AAAA"; //make static
	
	static void methodA() { //make static
		System.out.println(z);
	}
	
	static class B {
		void methodB() { 
			methodA();
		}
	}
}
