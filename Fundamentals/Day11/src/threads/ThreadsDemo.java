package threads;

public class ThreadsDemo {

	public static void main(String[] args) {
		// task 1
		System.out.println("App started.");

		// task 2
/*		version 1 - Sequential run
		MyTask task2 = new MyTask();
		task2.executeTask();
 */
		
/*		version 2 - extends Thread */
		MyTask task2 = new MyTask();
		task2.start();
 
		
/*		version 3 - implements Runnable 
		Runnable r = new MyTask();
		Thread task2 = new Thread(r);
		task2.start();
		*/

		
		// task 3
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " on Printer 1");
		}
		
		// task 4
		System.out.println("App finished.");
	}

}
/* version 1
class MyTask {
	public void executeTask() {
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " on Printer 2");
		}
	}
}
 */

/* version 2  */
class MyTask extends Thread {
	@Override
	public void run() {
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " on Printer 2");
		}
	}
}


/* version 3 
class MyTask implements Runnable {
	public void run() {
		for(int doc = 1; doc <= 10; doc++) {
			System.out.println("Printing document #" + doc + " on Printer 2");
		}
	}
}
 */
