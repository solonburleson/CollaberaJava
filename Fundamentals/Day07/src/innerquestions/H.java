package innerquestions;

public class H {
	G g = new G() {
	
		void methodG1(int i) {
			System.out.println(++i+i++);
		}
		
		void methodG2(int i) {
			System.out.println(i---i);
		}
	};
}
