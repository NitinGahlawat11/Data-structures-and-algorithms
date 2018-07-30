package bst;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Bst tree = new Bst();
	        tree.insert(10, "Ten");
	        tree.insert(20, "twenty");
	        tree.insert(22, "fifteen");
	        tree.insert(18, "fifteen");
	        tree.insert(19, "fifteen");
	        tree.insert(17, "fifteen");
	        tree.insert(24, "Twenty four");
	        tree.insert(21, "Twenty four");
	        tree.insert(4, "Four");
	        tree.insert(2, "Four");
	        tree.insert(5, "Four");
	        tree.insert(8, "Four");
	        tree.insert(9, "Four");
	        tree.insert(33, "Thirty three");
	         
	      System.out.println(tree.findMin().key);
	      System.out.println(tree.findMax().key);

}
}