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

	int findKthSmallest(Node root, int k) {
	    // add your logic here
		Stack<Node> ans = new Stack<>();
		Node node = root;
		int count=0;
		while(true){
			if(node != null){
				ans.push(node);
				node = node.left;
			}else{
				if(ans.isEmpty()) break;
				node = ans.pop();
				count++;
				if(count == k) return node.data;
				node = node.right;
			}
		}
		return -1;
	}
}
