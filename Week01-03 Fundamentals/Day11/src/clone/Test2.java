package clone;

public class Test2 implements Cloneable {
	int a, b;
	
	Test c = new Test();
	
	public Object clone() throws CloneNotSupportedException {
		Test2 t2obj = new Test2();
		
		try {
			t2obj = (Test2) super.clone();
			t2obj.c = new Test();
			t2obj.c.x = c.x;
			t2obj.c.y = c.y;
		} catch(CloneNotSupportedException e) {
			
		}
		
		return t2obj;
	}
}
