package annotations;

class B {
	void show() {
		System.out.println("Show in B");
	}
}

public class AnnotationsDemo extends B {

	public static void main(String[] args) {
		AnnotationsDemo demo = new AnnotationsDemo();
		demo.show();
	}
	
	public void show() {
		System.out.println("Show in Demo");
	}

}
