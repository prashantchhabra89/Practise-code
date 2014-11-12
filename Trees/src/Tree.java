import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;


public class Tree {
	Node root;
	LinkedList<Node> queue;
	int search;
	int flag;
	//Node traverser;

	public Tree()//initialize things in constructor
	{
		root=null;
		queue = new LinkedList<Node>();

	}

	public void insertNode()
	{
		//Hardcoding a tree
		/*     1
		 *    /\
		 *   2  3
		    /\  /\
		   4  5 6 7
		 */
		root = new Node(1);
		root.left = new Node(2);
		//root.left.parent = root;
		root.right = new Node(3);
		//root.right.parent = root;

		root.left.left = new Node(4);

		//root.left.left.parent = root.left;
		root.left.right = new Node(5);

		//root.left.right = root.left;

		root.right.left = new Node(6);
		//root.right.left.parent = root.right;
		root.right.right = new Node(7);
		//root.right.right.parent = root.right;	
	}

	public void inorderTraversal(Node node)
	{   /* Inorder traversal:  4,2,5,1,6,3,7 */

		if(node == null) {
			return; 
		}

		if(node.left!=null) {
			inorderTraversal(node.left);
		}

		node.displayNode();

		if(node.right!=null) { 
			inorderTraversal(node.right);
		}	
	}

	public void postorderTraversal(Node node)
	{// 4,5,2,6,7,3,1
		if(node == null)
		{
			return;
		}
		if(node.left!=null) {
			postorderTraversal(node.left);
		}
		if(node.right!=null) { 
			postorderTraversal(node.right);
		}
		node.displayNode();
	}
	public void preorderTraversal(Node node)
	{//1,2,4,5,3,6,7
		if(node == null)
		{
			return;
		}
		node.displayNode();
		if(node.left!=null) {
			preorderTraversal(node.left);
		}
		if(node.right!=null) { 
			preorderTraversal(node.right);
		}
	}
	public void levelorderTraversal(Node node)
	{//1,2,3,4,5,6,7
		Node tempNode;
		queue.addLast(node);
		while(!(queue.isEmpty()))
		{
			tempNode = queue.removeFirst();
			tempNode.displayNode();
			if(tempNode.left!=null)
			{
				queue.addLast(tempNode.left);
			}
			if(tempNode.right!=null)
			{
				queue.addLast(tempNode.right);
			}
		}
	}
	public void search(int x)
	{
		flag = 0;
		search = x;
		search(root);
		if(flag==0)
		{
			System.out.println("sorry not found");
		}
	}
	public void search(Node node)
	{
		if(node==null)
			return;
		if(node.left!=null)
			search(node.left);
		if(node.right!=null)
			search(node.right);
		if(node.data==search)
		{
			System.out.println("element found "+ node.data+"\n");
		    flag = 1;
			return;
		}
	}
}