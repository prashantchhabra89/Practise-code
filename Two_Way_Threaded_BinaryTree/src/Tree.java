import java.util.ArrayList;
import java.util.LinkedList;


public class Tree {
	Node F;
	Node B;
	Node G;
	Node A;
	Node D;
	Node I;
	Node C;
	Node E;
	Node H;
	ArrayList<Node> visitedList = new ArrayList<Node>();
	public void hardcode()
	{
		//see image for exact representation of tree
		//I am hardcoding a multithreaded 2 way binary tree as
		//I am making program of only traversal
		F = new Node('F');
		B = new Node('B');
		G = new Node('G');
		A = new Node('A');
		D = new Node('D');
		I = new Node('I');
		C = new Node('C');
		E = new Node('E');
		H = new Node('H');
		F.left = B;
		F.right = G;
		B.left = A;
		B.right = D;
		G.left = F;
		G.right = I;
		A.left = null;
		A.right = B;
		D.left = C;
		D.right = E;
		I.left = H;
		I.right = null;
		C.left = B;
		C.right = D;
		E.left = D;
		E.right = F;
		H.left = G;
		H.right = I;
	}
	public void inorderTravesal()
	{
		Node node = F;
		while(node.left!=null)
		{
			node = node.left;
		}
		System.out.println(node.data+"\n");
		visitedList.add(node);
		inorderTravesal(node.right);
	}
	public void inorderTravesal(Node node)
	{
		if(node.right == null)
		{
			System.out.println(node.data+"\n");
			visitedList.add(node);
			return;
		}
			while(!(visitedList.contains(node.left)))
			{
				node = node.left;
			}
			System.out.println(node.data+"\n");
			visitedList.add(node);
			inorderTravesal(node.right);		
	}
}























