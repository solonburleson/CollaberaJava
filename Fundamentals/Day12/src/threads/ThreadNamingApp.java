package threads;

public class ThreadNamingApp {

	public static void main(String[] args) {
		ThreadNaming alpha = new ThreadNaming("ALPHA");
		ThreadNaming beta = new ThreadNaming("BETA");
		
		System.out.println("Thread 1: " + alpha.getName());
		System.out.println("Thread 2: " + beta.getName());
		
		alpha.start();
		beta.start();
	}

}

class ThreadNaming extends Thread {
	ThreadNaming(String name){
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Thread ["+ getName() + "] is running....");
	}
}
