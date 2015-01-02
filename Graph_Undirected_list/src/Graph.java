import java.util.Arrays;
import java.util.List;
//This is the undirected unweighted but labelled(vertex) implementation of Adjacency list

public class Graph {
    //max vertices so that i can create vertex array
	int maxVertexNumber;
	//how many verteces have been initialized so that it doesn't exceed limit
	int initializedVertexCount;
	Vertex vertexArray[];

	public Graph(int vertexNumber)
	{
		maxVertexNumber = vertexNumber;
		vertexArray = new Vertex[maxVertexNumber];
		initializedVertexCount = 0;
	}
	public void makeVertex(String label)
	{
		if(initializedVertexCount<maxVertexNumber)
		{
			//contructor of vertex assigns label
			vertexArray[initializedVertexCount] = new Vertex(label);
			initializedVertexCount++;
		}
		else
			System.out.println("sorry you cannot add anymore vertex");
	}
	public void makeEdge(String label1, String label2)
	{
		//first we search for vertices which have these two labels
		// and then dono ki list me ek doosre ko daal do as its undirected graph
		int i;
		int j;
		int flag1 = 0;
		int flag2 = 0;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexArray[i].label.equals(label1))
			{
				flag1 = 1;
				break;
			}
		}
		for(j=0;j<maxVertexNumber;j++)
		{
			if(vertexArray[j].label.equals(label2))
			{
				flag2 = 1;
				break;
			}
		}
		if(flag1==1&&flag2==1)
		{
			vertexArray[i].addNeighbour(label2);
			vertexArray[j].addNeighbour(label1);
		}
		else
			System.out.println("sorry edge not created as one or more vertex not found\n");
	}

	public void printEdges(String label)
	{
		int i;
		int counterforPrinting = 0;
		List temp;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexArray[i].label.equals(label))
			{
				temp = vertexArray[i].neighbourList;
				for(Object string:temp)
				{
					System.out.println(label+","+temp.get(counterforPrinting)+"\n");
					counterforPrinting++;
				}
			}
		}
	}
	public void printNeighbours(String label)
	{
		int i;
		List temp;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexArray[i].label.equals(label))
			{
				temp = vertexArray[i].neighbourList;
				System.out.println(temp.toString());

			}

		}
	}

}
