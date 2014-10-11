public class LinkList {
	int data;
	LinkList nxt;
	static LinkList start=null;
	public LinkList()
	{

	}
	public void push(int x)
	{
		LinkList node =new LinkList();
		node.data=x;
		node.nxt=start;
		start=node;

	}
	public void viewAllElements()
	{
		if(isEmpty())
		{
			System.out.println("\nsorry our stack is empty");
		}
		else
		{
		LinkList traverser = start;
		while(traverser!=null)
		{
			System.out.println(traverser.data+"\n");
			traverser=traverser.nxt;
		}
		}
	}
	public void view()
	{
		if(isEmpty())
		{
			System.out.println("\nsorry our stack is empty");
		}
		else
		System.out.println("\n this is the top element "+start.data);
	}

	public boolean isEmpty()
	{
		if(start==null)
		{
			return true;
		}
		else
			return false;
	}
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("\nsorry our stack is empty");
		}
		else
		{
			System.out.println("\n I am popping this element"+start.data);
			start=start.nxt;
		}
		
	}


}


