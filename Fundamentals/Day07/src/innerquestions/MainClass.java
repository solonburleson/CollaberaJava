package innerquestions;

public class MainClass {

	public static void main(String[] args) {
		System.out.println(X.x);
		System.out.println(X.Y.y);
		System.out.println(X.Y.Z.z);
		
		C c = new C();
		System.out.println(C.s);
		C.D d = c.new D();
		System.out.println(d.s);
		d.methodD();
		
		E e = new E();
		e.methodOne();
		
		G g = new G();
		g.methodG1(10);
		g.methodG2(10);
		
		H h = new H();
		h.g.methodG1(10);
		h.g.methodG2(10);
	}

}
