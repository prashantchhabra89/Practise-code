//3.5 Implement a MyQueue class which implements a queue using two stacks.
/* basic Logic - we keep stack1 and stack2
we push only to stack1
when pop, if stack 2 is empty then first shift and then pop from stack2
similarly to pop is peek*/
import java.util.*;
public class Three_Five{
	static Stack stack1;
	static Stack stack2;
	public static void main(String args[])
	{	stack1 = new Stack();
		stack2 = new Stack();
		int input = 1;
		while(input!=0)
			{
			System.out.println("Press 1 for push, 2 for pop and 3 for peek");
			Scanner scanner = new Scanner(System.in);
			input = scanner.nextInt();
			switch(input)
				{
				case 1: push();
				break;
				case 2: pop();
				break;
				case 3: peek();
				break;
				default: System.out.println("Press a valid choice");
				}
			}
	}
	
	public static void push()
	{
	Scanner scanner = new Scanner(System.in);
	stack1.push(scanner.nextInt());
	}
	
	public static void pop()
	{
	int size = stack1.size();
	if(stack2.isEmpty())
		{
		for(int i=0; i<size; i++)
			{
			stack2.add(stack1.pop());
			}
		System.out.println("Popped element is " + stack2.pop());
		}
	else
		{
		System.out.println("Popped element is " + stack2.pop());
		}
	}
	
	public static void peek()
	{
	int size = stack1.size();
	if(stack2.empty())
		{
		for(int i=0; i<size; i++)
			{
			stack2.add(stack1.pop());
			}
		System.out.println("Peeked element is " + stack2.peek());
		}
	else
		{
		System.out.println("Peeked element is " + stack2.peek());
		}
	}		
}