
public class Strings {

	public static void main(String[] args) {
		String text = "Hello World Java";
		
		//extract ll
		System.out.println(text.substring(2, 4));
		//extract World
		System.out.println(text.substring(6, 11));
		//extract Java
		System.out.println(text.substring(12, 16));
		//produce error
		//System.out.println(text.substring(1,0));
		
		StringBuffer buff = new StringBuffer();
		buff.append("This");
		buff.append(" ");
		buff.append("is");
		System.out.println(buff.toString());
		
		String reverse = "";
		for(int i = text.length()-1; i >= 0; i--) {
			reverse += text.charAt(i);
		}
		System.out.println(reverse);
		
		StringBuffer sb = new StringBuffer(text);
		System.out.println(sb.reverse().toString());
	}

}
