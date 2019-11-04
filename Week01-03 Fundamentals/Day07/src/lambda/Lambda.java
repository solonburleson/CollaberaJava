package lambda;

interface Drawable {
	public void draw();
}

public class Lambda {
	
	public static void main(String[] args) {
		//before lambda
		int width = 10;
		Drawable d = new Drawable() {
			@Override
			public void draw() {
				System.out.println("Drawing width: " + width);
			}
		};
		d.draw();
		
		//lambda expression
		Drawable d2 = () -> {
			System.out.println("Drawing " + width);
		};
		d2.draw();
	}
}
