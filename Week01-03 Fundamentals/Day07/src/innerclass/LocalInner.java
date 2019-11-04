package innerclass;

public class LocalInner {
	private int data = 40;
	
	void display() {
		class Local {
			void msg() {
				System.out.println("data is: " + data);
			}
		}
		Local local = new Local();
		local.msg();
	}
}
