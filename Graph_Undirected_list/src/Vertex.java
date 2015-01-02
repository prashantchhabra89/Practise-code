import java.util.ArrayList;
import java.util.List;
//if I have to make weigheted(edges) than rather than using arraylist of string
//have to create arraylist of an object which has label and weight

public class Vertex {
	String label;
	List neighbourList;

	public Vertex(String labelofVertex)
	{
		label = labelofVertex;
		neighbourList = new ArrayList<String>();
	}
	public void addNeighbour(String labelofNeighbour)
	{
		if(neighbourList.contains(labelofNeighbour))
		{
			System.out.println("this edge is already existent");
		}
		else
			neighbourList.add(labelofNeighbour);
	}
}

