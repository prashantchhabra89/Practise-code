public class LinkList {
	int data;
	LinkList nxt;
	static LinkList start=null;
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
			start=node;
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
			tmp.nxt=node;
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
			start=start.nxt;
		}
		while(traverser != null)
		{
			if(traverser.nxt !=null && traverser.nxt.data == x)
			{
				System.out.println("item deleted");
				traverser.nxt=traverser.nxt.nxt;
				break;
			}
			traverser=traverser.nxt;
		}
		
	}

}
