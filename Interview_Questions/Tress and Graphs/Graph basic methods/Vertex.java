import java.util.*;
public class Vertex
	{
	ArrayList<String> listOfNeighbours;
	String label;
	public Vertex(String value, ArrayList<String> list)
		{
		label = value;
		listOfNeighbours = list;
		}
	}