package geometry;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle();
		
		circle.setRadius(7);
		
		System.out.println(circle.getArea());
		
		System.out.println(circle.getCircumference());
	}

}
