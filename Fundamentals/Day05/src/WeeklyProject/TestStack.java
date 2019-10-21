package WeeklyProject;

public class TestStack {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		
		stack.pop();
		stack.peek();
		stack.push("Python");
		stack.push("Ruby");
		stack.push("MEAN");
		stack.push("Java");
		stack.push("C#");
		stack.push("PHP");
		stack.peek();
		stack.pop();
		stack.peek();
		stack.push("PHP");
		stack.push("C++");
		stack.push("Swift");
		stack.push("React");
		stack.push("SQL");
		stack.push("Error Message");
	}

}
