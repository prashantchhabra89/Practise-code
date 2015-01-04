import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Graph graph;
		int switchcaseInput = 1;
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("please enter max number of vertex");
		graph = new Graph(Integer.parseInt(scanner2.nextLine()));
		while(switchcaseInput!=0)	
		{
			//just one case added for BFS
			System.out.println("Press 1 to make vertex\n 2 create edges\n"
					+ "3 to print edges\n 4 to print neighbours \n 5 for BFS\n 0 to exit");
			switchcaseInput = Integer.parseInt(scanner.nextLine());
			switch(switchcaseInput)
			{
			case 1: System.out.println("please enter label for vertex");
			graph.makeVertex((scanner2.nextLine()));
			break;

			case 2: System.out.println("please enter both labels of vertex between which you want to create edge");
			graph.makeEdge(scanner2.nextLine(), scanner3.nextLine());
			break;

			case 3: System.out.println("please enter label of vertex"
					+ "of which you wanna print edges");
			graph.printEdges(scanner2.nextLine());
			break;

			case 4: System.out.println("please enter label of vertex"
					+ "of which you wanna print neighbours");
			graph.printNeighbours(scanner2.nextLine());
			
			case 5: System.out.println("please enter label of vertex"
					+ "from which you want to start DFS traversal;"); 
				graph.DFS(scanner2.nextLine());
			}

		}
	}
}

