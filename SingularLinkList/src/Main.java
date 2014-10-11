import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
		System.out.println("Hello, World");
		LinkList linkList = new LinkList();
		int option=10;
		while(option!=0)
		{
			System.out.println("\n1 for Insert, 2 for display, 3 for delete, 0 for exit,");
			option=scanner.nextInt();
			switch (option)
			{
			case 1:System.out.println("\nPlease enter data for new node");
			linkList.insert(scanner.nextInt());
			break;
			case 2:linkList.display();
			break;
			case 3:System.out.println("\nPlease enter data of node you want to delete");
			linkList.delete(scanner.nextInt());
			}

		}
	}

}