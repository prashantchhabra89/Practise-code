import java.util.*;
public class Tree{
	static Node root = null;
	public static void main(String args[])
	{
	System.out.println("Welcome to program of Binary Search Tree");
	int input = 1;
	Scanner scanner = new Scanner(System.in);
	while(input!=0)
		{
		System.out.println("Please select one of the following options");
		System.out.println("1 to add item to tree");
		System.out.println("2 to search item");
		System.out.println("3 to delete item from tree");
		System.out.println("4 for preorder traversal");
		System.out.println("5 for inorder traversal");
		System.out.println("6 for postorder traversal");
		System.out.println("7 for level order traversal");
		System.out.println("0 to exit");
		input = scanner.nextInt();
		switch (input)
			{
			case 1: System.out.println("Enter data to be added in tree");
			add(scanner.nextInt());
			break;
			case 2:System.out.println("Enter data to be searched in tree");
			search(scanner.nextInt());
			break;
			case 3:System.out.println("Enter data of the node to be deleted");
			delete(scanner.nextInt());
			break;
			case 4:if(root!=null)
					{	
					preorder(root);
					}
				else
					{
					System.out.println("tree is empty");
					}
			break;
			case 5:if(root!=null)
					{
					inorder(root);
					}
				else
					{
					System.out.println("tree is empty");
					}

			break;
			case 6:if(root!=null)
					{
					postorder(root);
					}
					else
					{
					System.out.println("tree is empty");
					}
			break;			
			case 7:if(root!=null)
					{
					leverorder();
					}
					else
					{
					System.out.println("tree is empty");
					}
			break;
			case 0:
			break;
			default:
			System.out.println("Please enter a valid input");
			}

		}
	}
	public static void add(int x)
	{
	if(root == null)
		{
		root = new Node(x);
		}
	else
		{
		int flag = 0;
		Node traverser = root;
		while(flag !=1)
			{
				if(traverser.data == x)
					{
					System.out.println("Sorry node with this data already exists");
					flag = 1;
					}
				else
					{
					if(x<traverser.data)
						{
						if(traverser.left!=null)
							{
							traverser = traverser.left;
							}
						else
							{
							traverser.left = new Node(x);
							flag = 1;
							}
						}
					else
						{
						if(traverser.right!=null)
							{
							traverser = traverser.right;
							}
						else
							{
							traverser.right = new Node(x);
							flag = 1;
							}
						}
					}
			}
		
		}
	}
	
	public static Node search(int x)
	{
	if(root == null)
		{
		System.out.println("Sorry no node found");
		return null;
		}
	else
		{
		Node traverser = root;
		while(true)
			{
				if(traverser.data == x)
					{
					System.out.println("Node found");
					return traverser;
					}
				else
					{
					if(x<traverser.data)
						{
						if(traverser.left!=null)
							{
							traverser = traverser.left;
							}
						else
							{
							System.out.println("Sorry node not found");
							return null;
							}
						}
					else
						{
						if(traverser.right!=null)
							{
							traverser = traverser.right;
							}
						else
							{
							System.out.println("Sorry node not found");;
							return null;
							}
						}
					}
			}
		
		}
	}
		
	public static void preorder(Node traversar)
	{
	System.out.println(traversar.data);
	if(traversar.left!=null)
		{
		preorder(traversar.left);
		}
	if(traversar.right!=null)
		{
		preorder(traversar.right);
		}
	}

	public static void postorder(Node traversar)
	{
	if(traversar.left!=null)
		{
		postorder(traversar.left);
		}
	if(traversar.right!=null)
		{
		postorder(traversar.right);
		}
	System.out.println(traversar.data);
	}

	public static void inorder(Node traversar)
	{
	if(traversar.left!=null)
		{
		inorder(traversar.left);
		}
	System.out.println(traversar.data);
	if(traversar.right!=null)
		{
		inorder(traversar.right);
		}
	}
		
	public static void leverorder()
	{
	LinkedList <Node>queue = new LinkedList<Node>();
	queue.add(root);
	Node temp;
	while(!(queue.isEmpty()))
		{
		temp = queue.remove();
		System.out.println(temp.data);
		if(temp.left!=null)
			{
			queue.add(temp.left);
			}
		if(temp.right!=null)
			{
			queue.add(temp.right);
			}
		}
	}
	
	private static Node getParent(int x)
	{
	Node traverser = root;
	Node parent = traverser;
	while(true)
			{
				if(traverser.data == x)
					{
					System.out.println("Node found");
					return parent;
					}
				else
					{
					if(x<traverser.data)
						{
						if(traverser.left!=null)
							{
							parent = traverser;
							traverser = traverser.left;
							}
						else
							{
							System.out.println("Sorry node not found");
							return null;
							}
						}
					else
						{
						if(traverser.right!=null)
							{
							parent = traverser;
							traverser = traverser.right;
							}
						else
							{
							System.out.println("Sorry node not found");;
							return null;
							}
						}
					}
			}
	}
	
	public static void delTwoChildren(Node nodeToBeDeleted)
	{
	int tmp;
	Node traverser = nodeToBeDeleted.left;
	while(traverser.right!=null)
		{
		traverser = traverser.right;
		}
	tmp = traverser.data;
	delete(traverser.data);
	nodeToBeDeleted.data = tmp;
	}


	public static void delete(int x)
	{
	Node nodeToBeDeleted = search(x);
	if(nodeToBeDeleted!=null)
		{
		if(nodeToBeDeleted.left==null&&nodeToBeDeleted.right==null)
			{
			if(root.data == x)
				{
				root = null;
				}
			else
				{
				Node parent = getParent(x);
				if(parent.left!=null)
					{
					if(parent.left.data==x)
						{
						parent.left=null;
						}
					}
				
				else
					{
					parent.right=null;
					}
				}
			}
		else
			{
			if(nodeToBeDeleted.left==null&&nodeToBeDeleted.right!=null)
				{
				nodeToBeDeleted.data = nodeToBeDeleted.right.data;
				nodeToBeDeleted.right = null;
				}
			else
				{
				if(nodeToBeDeleted.left!=null&&nodeToBeDeleted.right==null)
					{
					nodeToBeDeleted.data = nodeToBeDeleted.left.data;
					nodeToBeDeleted.left = null;
					}
				else
					{
					delTwoChildren(nodeToBeDeleted);
					}				
				}
			}
		}
	}

}
	