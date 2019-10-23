package AbstractClass;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s  = new Circle();
		
		s.draw();
		s.normalMethod();
		
		s = new Rectangle();
		
		s.draw();
	}

}