import java.util.Scanner;


public class Main {
	static int input=100;
	public static void main(String[] args) {
		System.out.println("Hello, World");
		Tree tree = new Tree();
		Scanner scanner = new Scanner(System.in);
		while(input!=0)	
		{
			System.out.println("Press\n 1 to initialize tree\n 2 for inorder Travesal 0 to exit");
			input = Integer.parseInt(scanner.nextLine());
			switch(input)
			{
			case 1: tree.hardcode();
				break;
			case 2 : 
				tree.inorderTravesal();;
				break;
			}
		}
	}

}
