package syncthreads;

public class SyncThreadApp {

	public static void main(String[] args) {
		System.out.println("App started...");
		
		Printer p = new Printer();
//		p.printDocuments(10, "MarysResume.pdf");
		
		MyThread myRef = new MyThread(p);
		YourThread yourRef = new YourThread(p);
		
		myRef.start();
		
		yourRef.start();
		
		System.out.println("App finished.");
	}

}
