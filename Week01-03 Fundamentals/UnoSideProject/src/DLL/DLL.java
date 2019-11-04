package DLL;

public class DLL {
	public Node head;
	public Node tail;
	
	public DLL(){
		this.head = null;
		this.tail = null;
	}
	
	public void addNode(Node node) {
		if(head == null) {
			head = node;
		} else {
			Node runner = head;
			while(runner.next != null) {
				runner = runner.next;
			}
			runner.next = node;
			node.prev = runner;
			tail = runner.next;
		}
	}
}
