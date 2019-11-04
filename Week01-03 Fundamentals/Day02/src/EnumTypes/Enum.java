package EnumTypes;

public class Enum {
	public static enum Fruit{APPLE,ORANGE,BANANA};
	
	public void enumTest() {
		Enum.Fruit f1;
//		Enum.Fruit f2,f3;
		f1 = Enum.Fruit.APPLE;
//		f2 = Enum.Fruit.ORANGE;
//		f3 = Enum.Fruit.BANANA;
		System.out.println("Favorite Fruit is " + f1);
		
		Enum.Fruit favoriteFruit = f1;
		switch(favoriteFruit) {
			case APPLE: System.out.println("Rich in antioxidants and fiber!");
			break;
			case ORANGE:System.out.println("High in vitamin C!");
			break;
			case BANANA:System.out.println("High in potassium!");
			break;
		}
		
	}
}
