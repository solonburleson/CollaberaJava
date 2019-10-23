package nestedinterface;

interface Showable {
	void show();
	interface Message {
		void msg();
	}
}

public class NestedInterfacesTest implements Showable.Message{
	public void msg() {
		System.out.println("Hello nested interface");
	}

	public static void main(String[] args) {
		Showable.Message message = new NestedInterfacesTest();
		message.msg();
	}

}
