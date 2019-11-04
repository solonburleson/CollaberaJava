package oopquestions;

class W {
	int x = 111;
	
	static class Y extends W {
		int y = x + 222;
	}
	
	class Z extends W.Y {
		int z = y + 333;
	}
}

public class MainXYZTest {

	public static void main(String[] args) {
		W.Z z = new W().new Z();
		
		System.out.println(z.x); //111
		System.out.println(z.y); //333
		System.out.println(z.z); //666
	}

}
