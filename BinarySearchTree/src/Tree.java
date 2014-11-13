import java.util.LinkedList;


public class Tree {
	Node root;
	LinkedList<Node> queue;
	int search;
	int flag;
	Node insertPosition;
	String insertDirection;
	Node searchedNode;
	int delete_flag=0;

	public Tree()//initialize things in constructor
	{
		root=null;
		queue = new LinkedList<Node>();
	}

	public void insertNode(int x)
	{
		Node node = new Node(x);
		search = x;
		if(root==null)
		{
			root=node;
		}
		else
		{
			search(root);
			if(flag == 1)
			{
				System.out.println("sorry duplicate nodes not allowed in BST \n");
			}
			else{
				if(insertDirection.contentEquals("right"))
				{
					insertPosition.right = node;
					node.parent = insertPosition;
				}
				else
				{
					if(insertDirection.contentEquals("left"))
					{
						insertPosition.left = node;
						node.parent = insertPosition;
					}
				}
			}

		}


	}
	public void search(int x)
	{
		search=x;
		flag = 0;
		search(root);
		if(flag == 0)
		{
			System.out.println("this element does not exist\n");
		}
	}

	//isse searched node return nahi kar paa rahe the as recursion me return ka issue hai
	public void search(Node node)
	{
		if(node.data == search)
		{
			System.out.println("element found "+node.data+ "\n");
			flag = 1;
			searchedNode = node;
			return;//bcoz here function execution should break
		}
		if(search>node.data)
		{
			if(node.right!=null)
			{
				search(node.right);
			}
			else
			{
				insertPosition = node;
				insertDirection = "right";
				return;//bcoz here function execution should break
			}
		}
		if(search<node.data)
		{
			if(node.left!=null)
			{
				search(node.left);
			}
			else
			{
				insertPosition = node;
				insertDirection = "left";
				return;//bcoz here function execution should break
			}
		}		
	}
	public void levelorderTraversal(Node node)
	{
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
	private Node findInorderSuccessor(Node tempNode)
	{
		Node inorderSucessor = tempNode.right;
	    while(inorderSucessor.left !=null)
	    {
	    	inorderSucessor = inorderSucessor.left;
	    }
	    return inorderSucessor;
	}
	private void swapNodes(Node node1, Node node2)// swap is so simple
	{
		int temp = node1.data;
		node1.data = node2.data;
		node2.data = temp;
	}
	
	public void delete(int x)
	{
		if (delete_flag == 0){
			search = x;
			search(root);
		} 
		Node tempNode = searchedNode;
		delete_flag = 0;
		
		//if node to be deleted doesnt have any child
		if(tempNode.left == null && tempNode.right == null)
		{
			if(tempNode.parent.left == tempNode)//if node to be delted is left child
			{
				tempNode.parent.left = null;
				tempNode = null;
			}
			else
			{
				if(tempNode.parent.right == tempNode)//if node to be deleted is right child
				{
					tempNode.parent.right = null;
					tempNode = null;
				}
			}
		}
		else
		{
			//if node to be deleted has one child
			if(tempNode.left == null ^ tempNode.right == null)
			{
				//if node to be deleted has left child
				if(tempNode.left != null)
				{
					//if node to be deleted is left child
					if(tempNode.parent.left == tempNode)
					{
						tempNode.parent.left = tempNode.left;
						tempNode.left.parent = tempNode.parent;
					}
					else
						//if node to be deleted is right child
						if(tempNode.parent.right == tempNode)
						{
							tempNode.parent.right = tempNode.left;
							tempNode.left.parent = tempNode.parent;
						}			
				}
				//if node to be deleted has right child
				else
				{
					if(tempNode.right != null)
					{
						//if node to be deleted is left child
						if(tempNode.parent.left == tempNode)
						{
							tempNode.parent.left = tempNode.right;
							tempNode.right.parent = tempNode.parent;
						}
						else
							//if node to be deleted is right child
							if(tempNode.parent.right == tempNode)
							{
								tempNode.parent.right = tempNode.right;
								tempNode.right.parent = tempNode.parent;
							}
					}
				}
			}
			else
				//if node to be deleted has two child
				if(tempNode.left != null && tempNode.right != null)
				{
					Node insucc = findInorderSuccessor(tempNode);
					swapNodes(tempNode,insucc);					
					//the suvessor will have either 0 or one child
					//delete
					//jugaad as jisko delte karna hai vo bst ka order follow nahi karta
					//isliye it doesn't need to be searched in normal way
					delete_flag=1;
					searchedNode = insucc;
					delete(insucc.data);
				}
		}
		
	}
}