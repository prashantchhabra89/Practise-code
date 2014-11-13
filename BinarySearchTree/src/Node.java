public class Node {
	int data;
	Node left;
	Node right;
	Node parent;


	public Node (int x)
	{
		data = x;
		left = null;
		right = null;
		parent = null;
	}
	public void displayNode()
	{
		System.out.println("data "+data);
		if(parent == null)
		{
			System.out.println(" parent is null");
		}
		else
			System.out.println(" parent "+parent.data);
	}
}