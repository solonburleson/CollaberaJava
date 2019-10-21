package WeeklyProject;

public class MyStack {
	private int stackSize;
	private String[] stackData;
	private int topOfStack;
	
	public MyStack() {
		stackSize = 10;
		topOfStack = 0;
		stackData = new String[stackSize];
	}
	
	public void push(String str) {
		if(topOfStack < stackSize) {
			stackData[topOfStack] = str;
			topOfStack++;
			System.out.println("PUSH: New data element [" + str + "] is pushed into the stack");
		} else {
			System.out.println("PUSH: Cannot push. Stack is full!");
		}
	}
	
	public String pop() {
		if(topOfStack > 0) {
			String str;
			str = stackData[topOfStack-1];
			stackData[topOfStack-1] = null;
			topOfStack--;
			System.out.println("POP: Top data element [" + str + "] is removed from the stack");
			return str;
		} else {
			System.out.println("POP: Cannot pop. Nothing in the stack!");
			return null;
		}
	}
	
	public String peek() {
		if(topOfStack > 0) {
			System.out.println("PEEK: [" + stackData[topOfStack-1] + "] is at the top of the stack.");
			return stackData[topOfStack-1];
		} else {
			System.out.println("PEEK: Cannot peek. Stack is empty.");
			return null;
		}
	}
}
