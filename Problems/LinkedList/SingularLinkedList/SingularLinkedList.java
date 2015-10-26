import java.util.*;
public class SingularLinkedList{
	static Node start = null;
	public static void main(String args[])
	{
	presentPossibleOptions();
	
	}
	
	public static void presentPossibleOptions()
	{
	int option = 1;
	Scanner scanner = new Scanner(System.in);
	while(option!=0)
		{
		System.out.println("Please enter one of the following option:");
		System.out.println("Press 1 to add a new item");
		System.out.println("Press 2 to delete an item");
		System.out.println("Press 3 to display all items in linked list");
		System.out.println("Press 0 to exit");
		option = scanner.nextInt();
		switch (option)
			{
			case 1: System.out.println("Enter the value of new item as int");
			add(scanner.nextInt());
			break;
			case 2: System.out.println("Enter the value of item to be deleted");
			delete(scanner.nextInt());
			break;
			case 3: System.out.println("Here are the current items");
			display();
			break;
			case 0: break;
			default:
			System.out.println("You did not enter a valid option. try again!");
			}
		}
	}
	
	public static void add(int value)
	{
	Node node = new Node(value);
	if(start == null)
		{
		start = node;
		}
	else
		{
		Node traverser = start;
		while(traverser.next!=null)
			{
			traverser = traverser.next;
			}
		traverser.next = node;
		}	
	}

	public static void delete(int value)
	{
	if(start==null)
		{
		System.out.println("Sorry list is empty");
		}
	else
		{
		Node traverser = start;
		int flag = 0;
		Node previous = null;
		if(start.data==value)
			{
			start = start.next;
			flag = 1;
			}
		else 
		{
			while(traverser!=null)
				{
				if(traverser.data==value)
					{
					previous.next = traverser.next;
					flag = 1;
					break;
					}
				previous = traverser;
				traverser = traverser.next;
				}
		}
		if(flag == 0)
			{
			System.out.println("Sorry the specified item not found");
			}
		else
			{
			System.out.println("Item found and delete");
			}
		}
	}

	public static void display()
	{
	if(start==null)
		{
		System.out.println("Sorry no items are in the list");
		}
	else
		{
		Node traverser = start;
	        while(traverser!=null)
			{
			System.out.println(traverser.data);
			traverser=traverser.next;
			}
		
		}
	}
}

	

