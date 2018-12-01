package redblack;

public class Main {
	private static RedBlackTree<Integer, String> redBlackTree;
	
	public static void main(String[] args) {
		redBlackTree = new RedBlackTree<Integer, String>();
		insertRandomalues();	
	}
	
	private static void insertRandomalues() {
		for(int i = 0; i < 15; i++) {
			int key = (int) (Math.random() * 30 + 1);
			redBlackTree.insert(key, "Hi");
		}
	}
}
