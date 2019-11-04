package Continue;

public class ContinueTest {

	public static void main(String[] args) {
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 3; j++) {
//				if(i == 2 && j == 2) {
//					continue;
//				}
//				System.out.println(i + " " + j);
//			}
//		}

//		aa:
//		for(int i = 1; i <= 3; i++) {
//			for(int j = 1; j <= 3; j++) {
//				if(i == 2 && j == 2) {
//					continue aa;
//				}
//				System.out.println(i + " " + j);
//			}
//		}
	
		int i = 1;
		while(i <= 10) {
			if(i == 5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
