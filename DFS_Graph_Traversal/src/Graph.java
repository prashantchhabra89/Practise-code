import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
//To implement this, I took adjacency list representation of graph which I previously created and 
//added two function in graph.java and one switch case in main.java
//1. i need to keep count of number of vertex in visited list. if at the end of function,
//its not equal to no of vertices I will keep on calling same function with randomly different node
//2. It is depth first search, that means that it is used for searching so we can call this function
//with a node and just stop it when element is found
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
			//if I am making directed graph then only one the following line
			//will be needed
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

	//New function #1 for BFS
	//private as not called from outside class
	public List<String> getNeighbours(String label)
	{
		int i;
		List temp;
		ArrayList<Vertex> returnNeighbourList;
		for(i=0;i<maxVertexNumber;i++)
		{
			if(vertexArray[i].label.equals(label))
			{
				return vertexArray[i].neighbourList;
			}

		}
		return null;
	}

	//New function #2 for BFS
	public void DFS(String rootLabel)
	{
		Stack<String> unprocessedStack = new Stack<String>();
		List<String> visitedList = new ArrayList<String>();
		//current node neighbour list is quite self explanatory
		List<String> currentNodeNeighbourList = new ArrayList<String>();
		List<String> processedList = new ArrayList<String>();
		unprocessedStack.add(rootLabel);
		visitedList.add(rootLabel);
		while(!unprocessedStack.isEmpty())
		{
			currentNodeNeighbourList = getNeighbours(unprocessedStack.peek());
			int flag = 0;
			for(String vertex : currentNodeNeighbourList)
			{
			//	so when I am at a vertex, I see its neighbours
			// i need only one neighbour which is not been visited before.
			// if i find that means i can keep on going on that branch
			// so I add that vertex to visited list and add it as unprocessed
			//(unprocessed because all its neighbours are not yet visited)	
			//i break this for loop on obtaining such neighbour as i want to go deep
			//and visit this newly found vertex	
				if(!visitedList.contains(vertex))
				{
					visitedList.add(vertex);
					unprocessedStack.add(vertex);
					flag = 1;
					break;
				}
			//if while checking all neighbours of a vertex,
			//i am not able to find even a single unvisited vertex,
			//i will remove that vertex from stack(As its now processed)
			//doing so will continue the while loop and I basically start again from 
			// from its parent[Backtracking]	
			}
			if(flag==0)
			processedList.add(unprocessedStack.pop());
		}
		System.out.println(visitedList.toString());
	}

}
