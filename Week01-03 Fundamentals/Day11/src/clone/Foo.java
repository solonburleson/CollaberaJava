package clone;

public class Foo implements Cloneable {
	public int num;
	public int[] nums;
	
	@Override
	public Foo clone() {
		Foo fobj = null;
		try {
			fobj = (Foo) super.clone();
		} catch(CloneNotSupportedException e) {
			
		}
		
		return fobj;
	}
}
