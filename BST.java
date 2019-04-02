
public class BST<String> {
	private BSTNode root;
	public BST(BSTNode node) {
		root = node;
	}
	public BST() {
		root = null;
	}
	
	public boolean find(Comparable value) {
		return find(root, value);
	}
	
	private boolean find(BSTNode node, Comparable value) {
		if(node == null) 
			return false;
		if(node.element().compareTo(value) == 0) 
			return true;
		else if(node.element().compareTo(value) > 0)
			return find(node.right(), value);
		else
			return find(node.left(),value);
	}
	
	public void insert(Comparable value) {
		root = insert(root, value);
	}
	
	private BSTNode insert(BSTNode node, Comparable value) {
		if(node == null) {
			BSTNode n = new BSTNode(value);
			return n;
		}
		else if(node.element().compareTo(value) > 0)
			node.setRight(insert(node.right(), value));
		else
			node.setLeft(insert(node.left(),value));
		return node;
	}

	public void print(){
		print(root);
	}
	private void print(BSTNode node) {
		if(node == null) {
			print(node.left());
			System.out.print(" " + node.element() +" ");
			print(node.right());
		}
	}
	
	public void delete(Comparable value) {
		root = delete(root, value);
	}
	public BSTNode delete(BSTNode node, Comparable value) {
		if(node == null) 
			return null;
		if(node.element().compareTo(value) == 0) {
			if(node.left() == null)
				return node.right();
			else if(node.right() == null)
				return node.left();
			else
				if(node.right().left() == null) {
					node.setElement(node.right().element()) ;
					node.setRight(node.right().right());
					return node;
				}
				else {
					node = (BSTNode) removeSmallest(node.right());
					return node;
				}		
		}
		else if(node.element().compareTo(value) < 0)
			node.setRight(delete(node.right(), value));
		else
			node.setLeft(delete(node.left(),value));
		return node;
	}
	
	private Comparable removeSmallest(BSTNode node) {
		if(node.left().left() == null) {
			Comparable smallest = node.left().element();
			node.setLeft(node.left().right());
			return smallest;
		}
		else
			return removeSmallest(node.left());
	}

}
