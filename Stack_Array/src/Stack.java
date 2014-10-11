
public class Stack {
	private int[]anArray;
	private int top=-1;
	public Stack(int size)
	{
		anArray=new int[size];	
	}
	  public void push(int element)
	    {
		  if (isFull()) {
			  System.out.println("Stack is Full!");
		  } else {
			  anArray[++top] = element;
		  }
		  
	    }
	    
	    public void pop()
	    {
	    	if (isEmpty()) {
	    		System.out.println("Stack is Empty!");
	    	} else {
	    		top--;
	    	}
	    }
	    public void view()
	    {
	    	if (!isEmpty()) {
	    		System.out.println("Top item: "+anArray[top]);
	    	} else {
	    		System.out.println("Stack is empty!");
	    	}    	
	    }
	    public boolean isEmpty()
	    {
	    	if (top == -1) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    }
	    public boolean isFull()
	    {
	    	if (top+1 == anArray.length) {
	    		return true;
	    	} else {
	    		return false;
	    	}
	    	
	    }

}
