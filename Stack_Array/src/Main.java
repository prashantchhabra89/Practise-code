import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        Scanner scanner = new Scanner( System.in );
    Stack stack = new Stack(10);
	int option=10;
	while(option!=0)
	{
		System.out.println("\n1 for push, 2 for pop, 3 for isempty, 4 for isfull, 5 for view, 0 for exit,");
		option=scanner.nextInt();
		switch (option)
		{
		case 1:System.out.println("\nPlease enter data for new node");
		stack.push(scanner.nextInt());
		break;
		case 2:stack.pop();;
		break;
		case 3:if(stack.isEmpty())
			{
			System.out.println("\nyes stack is empty");
			}
		else
			System.out.println("\nno stack is non empty");
		break;
		case 4:if(stack.isFull())
		{
		System.out.println("\nyes stack is full");
		}
	else
		System.out.println("\nno stack is not full");
		break;
		case 5:stack.view();
		}
		

	}
}
}
