import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		System.out.println("Hello, World");
		Scanner scanner = new Scanner( System.in );
		//selectionSort.initialzieArray(scanner.nextInt());

		int option =10;
		while(option!=0)
		{
			System.out.println("\nPress 1 for factorial, 2 for fibonnaci and 0 for exit");
			option = scanner.nextInt();
			switch (option)
			{
			case 1 : System.out.println("\nEnter # for cal. factorial");
			System.out.println(fact(scanner.nextInt()));
			break;
			case 2 : System.out.println("\nEnter # for cal. fibonacci");
			System.out.println(fibonnaci(scanner.nextInt()));
			break;

			}

		}

	}
	public static int fact(int num)//cannot make a non static method call from static
	{
		if(num==1 || num==0)
		{
			return 1;
		}
		else
			return num*fact(num-1);
	}
	public static int fibonnaci(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		else
		{

			if(num == 2 || num ==1)
			{
				return 1;
			}
			else return fibonnaci(num-1) + fibonnaci(num-2);
		}
	}
}
