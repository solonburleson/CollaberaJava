package innerquestions;

public class E {
	void methodOne() {
		class F {
			void methodTwo() {
				System.out.println("Method Two");
			}
		}
		new F().methodTwo();
	}
	
//	void MethodThree() { wrong
//		new F().methodTwo();
//	}
}
