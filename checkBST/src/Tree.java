import java.lang.Boolean;
public class Tree {

	public Tree()
	{
		
	}
	public Node hardCodedTree1()
	{
		//This function will create a tree in which one of the element
		//of left subtree is greater than parent
		Node root1 = new Node(20);
		root1.left = new Node(10);
		root1.right = new Node(30);
		root1.right.right = new Node(40);
		root1.right.left = new Node(5);
		return root1;
		
	}
	public Node hardCodedTree2()
	{
		//This function will create a tree in which one of the element
	    //of right subtree is less than parent
		Node root2 = new Node(10);
		root2.left = new Node(9);
		root2.left.left = new Node(8);
		root2.left.left.right = new Node(30);
		root2.left.left.right.right = new Node(40);
		return root2;
	}
	public Node hardCodedTree3()
	{
		//will create a binary search tree
		//Hardcoding a tree
				/*     5
				 *    /\
				 *   3  7
				    /\  /\
				   1  4 6 8
				 */
		Node root3 = new Node(5);
		root3.left = new Node(3);
		root3.right = new Node(7);
		root3.left.left = new Node(1);
		root3.left.right = new Node(4);
		root3.right.right = new Node(8);
		root3.right.left = new Node(6);
		return root3;
	}
	public boolean checkIfBST(Node node, int max, int min)
	{
		if(node == null)
			return true;// means parent was leaf node. If we have reached leaf node, then true right!
		if(node.data>=max || node.data<=min)
			return false;
		return checkIfBST(node.left, node.data, min) && checkIfBST(node.right, max, node.data);
		//the left subtree should be less than the node and right subtree must be greater than the node

	}
}
