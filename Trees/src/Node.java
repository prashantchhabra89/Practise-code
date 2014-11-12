
public class Node {
	int data;
	Node left;
	Node right;
	Node parent;
	//Node node; this was not needed here. its not part of node.I needed it 
	//just to return node

	public Node (int x)
	{
		data = x;
		left = null;
		right = null;
		parent = null;
	}
	public void displayNode()
	{
		System.out.println(data + ", ");
	}
}
