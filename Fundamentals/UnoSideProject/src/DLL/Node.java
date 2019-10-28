package DLL;

import Game.Player;

public class Node {
	public Player player;
	public Node next;
	public Node prev;
	
	public Node() {
		player = null;
		next = null;
		prev = null;
	}
	
	public Node(Player p) {
		player = p;
		next = null;
		prev = null;
	}
}
