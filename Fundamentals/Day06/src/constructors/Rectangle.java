package constructors;

public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		setWidth(0);
		setHeight(0);
	}
	
	public Rectangle(int x) {
		setWidth(x);
		setHeight(x);
	}
	
	public Rectangle(int x, int y) {
		setWidth(x);
		setHeight(y);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return getWidth() * getHeight();
	}
	
}
