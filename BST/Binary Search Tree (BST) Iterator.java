/* This is the Node class definition

class Node {
	public Node left;
	public Node right;
	public int data;

	public Node(int data) {
		this.data = data;
	}
}
*/
class BSTIterator {
	Stack<Node> ans = new Stack<>();
    public BSTIterator(Node root) {
		addAllleft(root);
    }
	private void addAllleft(Node node){
		while(node != null){
			ans.push(node);
			node = node.left;
		}
	}
    
    public boolean hasNext() {
		return !ans.isEmpty();
    }
    
    public Node next() {
		Node top = ans.pop();
		addAllleft(top.right);
		return top;
    }
}
