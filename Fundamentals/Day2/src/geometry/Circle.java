package geometry;

public class Circle {
	private double radius, area, circumference;
	
	public void setRadius(double rad) {
		radius = rad;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
	public double getCircumference() {
		circumference = 2 * Math.PI * radius;
		return circumference;
	}
}
