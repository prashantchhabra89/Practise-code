public class Node {
	char data;
	Node left;
	Node right;


	public Node (char x)
	{
		data = x;
		left = null;
		right = null;
	}
	public void displayNode()
	{
		System.out.println("data "+data);
		
	}
}