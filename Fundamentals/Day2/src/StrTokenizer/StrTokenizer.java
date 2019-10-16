package StrTokenizer;

import java.util.StringTokenizer;

public class StrTokenizer {

	public static void main(String[] args) {
		String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		String strReverse;
		
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(days);
		
		while(st.hasMoreTokens()) {
			sb.insert(0, st.nextToken());
			if(st.hasMoreTokens()) {
				sb.insert(0, " ");
			}
		}
		strReverse = sb.toString();
		System.out.println(strReverse);
	}

}
