import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
		System.out.println("Hello, World");
		LinkList linkList = new LinkList();
		int option=10;
		while(option!=0)
		{
			System.out.println("\n1 for Insert, 2 for display, 3 for delete, 4 for search, 5 for printing head and tail, 0 for exit,");
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
			break;
			case 4:System.out.println("\nplease tell what item to search");
			linkList.search(scanner.nextInt());
			break;
			case 5:linkList.printHeadAndTail();
			}
			

		}
	}

}