import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        Scanner scanner = new Scanner( System.in );
        BubbleSort bubbleSort = new BubbleSort();
    	int option=10;
    	while(option!=0)
    	{
    		System.out.println("\n1 specify array, 2 to display");
    		option=scanner.nextInt();
    		if(option == 1)
    		{
        		System.out.println("\nsize of array?");
    			bubbleSort.initialzieArray(scanner.nextInt());
    		}
    		if(option == 2)
    		{
    			bubbleSort.display();
    		}
    	}
    }
}
