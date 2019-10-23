package staticnested;

public class StaticNested {
	static int data = 50;
	
	static class Inner {
		static void msg() {
			System.out.println("data is: " + data);
		}
	}

	public static void main(String[] args) {
		StaticNested.Inner.msg();
	}

}
