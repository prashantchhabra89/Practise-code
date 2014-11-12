import java.util.Scanner;


public class Main {
	static int input=100;
	public static void main(String[] args) {
		System.out.println("Hello, World");
		Tree tree = new Tree();
		tree.insertNode();
		Scanner scanner = new Scanner(System.in);
		while(input!=0)	
		{
			System.out.println("Press 1 for inorder traversal\n 2 for postorder\n 3 for preorder\n 4 for level order\n 5 for search \n 0 to exit");
			input = Integer.parseInt(scanner.nextLine());
			switch(input)
			{
			case 1 : tree.inorderTraversal(tree.root);
			break;
			case 2: tree.postorderTraversal(tree.root);
				break;
			case 3: tree.preorderTraversal(tree.root);
				break;
			case 4: tree.levelorderTraversal(tree.root);
			break;
			case 5: System.out.println("what item to search?");
			tree.search(Integer.parseInt(scanner.nextLine()));
			}
		}
	}

}
