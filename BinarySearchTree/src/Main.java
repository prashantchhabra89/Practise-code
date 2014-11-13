import java.util.Scanner;


public class Main {
	static int input=100;
	public static void main(String[] args) {
		System.out.println("Hello, World");
		Tree tree = new Tree();
		Scanner scanner = new Scanner(System.in);
		while(input!=0)	
		{
			System.out.println("Press\n 1 to initialize tree\n 2 for insert\n 3 for search\n 4 for levelorder display\n 5 to delete \n 0 to exit");
			input = Integer.parseInt(scanner.nextLine());
			switch(input)
			{
			case 1: System.out.println("Wait while initializing tree...");
				tree.insertNode(60);
				tree.insertNode(40);
				tree.insertNode(80);
				tree.insertNode(20);
				tree.insertNode(90);
				tree.insertNode(10);
				tree.insertNode(75);
				tree.insertNode(50);
				tree.insertNode(70);
				System.out.println("Done!");
				break;
			case 2 : System.out.println("what item to insert?\n");
				tree.insertNode(Integer.parseInt(scanner.nextLine()));;
				break;
			case 3: System.out.println("what item to search?");
				tree.search(Integer.parseInt(scanner.nextLine()));
				break;
			case 4: tree.levelorderTraversal(tree.root);
				break;
			case 5: System.out.println("what item to delete");
				tree.delete(Integer.parseInt(scanner.nextLine()));
			}
		}
	}

}
