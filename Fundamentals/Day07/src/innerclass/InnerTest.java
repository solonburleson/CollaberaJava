package innerclass;

public class InnerTest {

	public static void main(String[] args) {
		MemberInner obj = new MemberInner();
		MemberInner.Inner in = obj.new Inner();
		in.msg();
		
		LocalInner local = new LocalInner();
		local.display();
	}

}
