
public class LinkList {
	int data;
	LinkList nxt;
	LinkList prev;
	static LinkList start=null;
	static LinkList tail=null;
	public LinkList()
	{
		
	}
	public void insert(int x)
	{
		if(start==null)
		{
			LinkList node =new LinkList();
			node.data=x;
			node.nxt=null;
			node.prev=null;
			start=node;
			tail=node;
		}
		else{
			LinkList tmp =start;
			while(tmp.nxt!=null)
			{ tmp = tmp.nxt;
			}
			LinkList node =new LinkList();
			//traverser=traverser.nxt;
			node.data=x;
			node.nxt=null;
			node.prev=tmp;
			tmp.nxt=node;
			tail=node;
		}
			
	}
	public void display()
	{
		LinkList traverser = start;
		while(traverser!=null)
		{
			System.out.println(traverser.data+"\n");
			traverser=traverser.nxt;
		}
	}
	public void delete(int x)
	{
		LinkList traverser = start;
		if(start.data==x)
		{
			
			if(tail==start)
			{
				tail=null;
			}
			start=start.nxt;
		}
		while(traverser != null)
		{
			if(traverser.nxt !=null && traverser.nxt.data == x)
			{
				if(traverser.nxt.nxt==null)
				{
					tail=traverser;
				}
				System.out.println("item deleted");
				traverser.nxt=traverser.nxt.nxt;
				break;
			}
			traverser=traverser.nxt;
		}	
	}
	public void search(int x)
	{
		int flag = 0;
		LinkList traverser=start;
		while(traverser!=null)
		{
			if(traverser.data==x)
			{
				System.out.println("\n Item found"+traverser.data);
				flag = 1;
				break;
			}
			traverser=traverser.nxt;	
		}
		if(flag == 0)
		{
			System.out.println("\nSorry item not found");
		}
	}
	public void printHeadAndTail()
	{
		if(tail==null)
		{
			System.out.println("\ntail is null");
		}
		else
			System.out.println("\ntail is "+tail.data);
		if(start==null)
		{
			System.out.println("\nhead is null");
		}
		else
			System.out.println("\nhead is "+start.data);
	}

}
