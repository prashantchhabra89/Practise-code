//This is a implementation of undirected, non weighted, labelled(vertex ) graph
//basic logic is that we have to use a matrix for storing that which vertex have edge and which not
//and just follow the skeleton code
//In its implementation, I have used 1,0 in place of true false and tried to follow function sig given in notes
//and also copied here
//make-graph(): graph
//Create a new graph, initially with no nodes or edges.
//make-vertex(graph G, element value): vertex
//Create a new vertex, with the given value.
//make-edge(vertex u, vertex v): edge
//Create an edge between u and v. In a directed graph, the edge will flow from u to v.
//get-edges(vertex v): edge-set
//Returns the set of edges flowing from v
//get-neighbors(vertex v): vertex-set
//Returns the set of vertices connected to v


public class Graph {
	//so [2][3] represents an edge if [2][3] = 1
	int graphMatrix [][];
	//label of every vertex is stored 
	String vertexLabel[];
	//max no of vertices so we can initialize 2-d array
	int maxVertexNumber;
	//count of how many vertices are initialized so that labels can be assigned 
	//without asking indexes from the user
	int initializedVertexCount;
	
	public Graph(int vertexNumber)
	{
		maxVertexNumber = vertexNumber;
		graphMatrix = new int [maxVertexNumber][maxVertexNumber];
		vertexLabel = new String[maxVertexNumber];
		initializedVertexCount = 0;
	}
	
	public void makeVertex(String label)
	{
		if(initializedVertexCount<maxVertexNumber)
		{
			vertexLabel[initializedVertexCount] = label;
		initializedVertexCount++;
		}
		else
			System.out.println("sorry you cannot add anymore vertex");
	}
	
	public void makeEdge(String label1, String label2)
	{
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexLabel[i].equals(label1))
			{
				flag1 = 1;
				//break as when vertex found no need to continue loop
				break;
			}
		}
		for(j=0;j<maxVertexNumber;j++)
		{
			if(vertexLabel[j].equals(label2))
			{
				flag2 = 1;
				break;
			}
		}
		//if both vertices are found create edge
		if(flag1==1&&flag2==1)
		{
		graphMatrix[i][j] = 1;
		graphMatrix[j][i] = 1;
		}
		else
			System.out.println("sorry edge not created as one or more vertex not found\n");
	}
	public void printEdges(String label)
	{//all edges from a specific vertex
		int i;
		int j;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexLabel[i].equals(label))
			{
				for(j=0;j<maxVertexNumber;j++)
				{
					if(graphMatrix[i][j] == 1)
					{
						System.out.println("unordered pair "+vertexLabel[i]+ ","+vertexLabel[j]+"\n");
					}
				}
			}
		}
	}
	public void printNeighbours(String label)
	{//neighbours are those which have direct edge
		int i;
		int j;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexLabel[i].equals(label))
			{
				for(j=0;j<maxVertexNumber;j++)
				{
					if(graphMatrix[i][j] == 1)
					{
						System.out.println(vertexLabel[j]+"\n");
					}
				}
			}
		}
	}
}
