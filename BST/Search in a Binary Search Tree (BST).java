class Solution {
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

	Node searchBst(Node root, int val) {
	    // add your logic here
		    if(root == null) return null;
        if(root.data == val) return root;
        if(root.data > val) return searchBst(root.left,val);
        else return searchBst(root.right,val);
	}
}
