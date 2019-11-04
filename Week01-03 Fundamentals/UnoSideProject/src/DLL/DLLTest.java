package DLL;

import Game.Player;

public class DLLTest {

	public static void main(String[] args) {
		DLL dll = new DLL();
		Player p1 = new Player("Train");
		Node node = new Node(p1);
		
		dll.addNode(node);
		System.out.println(dll.head.player.name);
	}
}
