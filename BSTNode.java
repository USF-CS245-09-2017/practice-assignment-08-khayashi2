class BSTNode { 

	private Comparable element;
    private BSTNode left;
    private BSTNode right;
    
    public BSTNode(Comparable elem, BSTNode lft, BSTNode rght) {
	element = elem;
	left = lft;
	right = rght;
    }

    public BSTNode(Comparable elem) {
	element = elem;
    }

    public Comparable element() {
	return element;
    }

    public BSTNode left() {
	return left;
    }

    public BSTNode right() {
	return right;
    }

    public void setLeft(BSTNode newLeft) {
	left = newLeft;
    }

    public void setRight(BSTNode newRight) {
	right = newRight;
    }

    public void setElement(Comparable elem) {
	element = elem;
    }

}
