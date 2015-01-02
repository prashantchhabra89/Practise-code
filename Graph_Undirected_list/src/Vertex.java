import java.util.ArrayList;
import java.util.List;


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

