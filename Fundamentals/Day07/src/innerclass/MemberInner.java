package innerclass;

public class MemberInner {
	private int data = 30;
	
	class Inner {
		void msg() {
			System.out.println("data is: " + data);
		}
	}
}
