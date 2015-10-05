/*basic Logic - I have used a hashmap which has string(vertex name) and Vertex object. Hence for
every vertex we will add vertex name and vertex object. The vertex object has vertex name and list of vertices. This list is of string type and contains those vertices which have edge with the vertex name[string of hashmap]*/ 
import java.util.*;
public class Graph
	{
	static Scanner scanner;
	static HashMap<String,Vertex> mapOfVertex;
	public static void main (String args[])
		{
		scanner = new Scanner(System.in);
		int input = 1;
		mapOfVertex = new HashMap<String, Vertex>();
		while(input!=0)
			{
			System.out.println("Please select one of the following options");
			System.out.println("2 for making new vertex");
			System.out.println("3 for making new edge");
			System.out.println("4 for getting edges associated with a vertex");
			System.out.println("5 for getting all neighbours of a vertex");
			System.out.println("0 to exit");
			input = scanner.nextInt();
			switch(input)
				{
				case 2:makeVertex();
				break;
				case 3:makeEdge();
				break;
				case 4:getEdges();
				break;
				case 5:getNeighbours();
				break;
				case 0:
				break;
				default: System.out.println("Please press a valid option");
				break;
				}
			}
		}

	public static void makeVertex()
		{
		System.out.println("Enter label/value of the vertex");
		scanner = new Scanner(System.in);
		String vertexName = scanner.nextLine();
		Vertex vertex= new Vertex(vertexName, new ArrayList<String>());
		mapOfVertex.put(vertexName, vertex);
		}
	public static void makeEdge()
		{
		System.out.println("Enter the two vertex to create edge");
		scanner = new Scanner(System.in);
		String vertex1Name = scanner.nextLine();
		String vertex2Name = scanner.nextLine();
		Vertex  vertex1 = mapOfVertex.get(vertex1Name);
		Vertex  vertex2 = mapOfVertex.get(vertex2Name);
		vertex1.listOfNeighbours.add(vertex2Name);
		vertex2.listOfNeighbours.add(vertex1Name);
		}
	public static void getEdges()
	{
	scanner = new Scanner(System.in);
	System.out.println("Enter the vertex to get edges");
	String vertexName = scanner.nextLine();
	Vertex vertex = mapOfVertex.get(vertexName);
	System.out.println("edges are: ");
	for(String str : vertex.listOfNeighbours)
		{
		System.out.println(vertexName+" - " + str);
		}
	}
	
	public static void getNeighbours()
	{
	scanner = new Scanner(System.in);
	System.out.println("Enter the vertex to get edges");
	String vertexName = scanner.nextLine();
	Vertex vertex = mapOfVertex.get(vertexName);
	System.out.println("neighbours of "+vertexName+" are: ");
	System.out.println(vertex.listOfNeighbours.toString());

	}

	}