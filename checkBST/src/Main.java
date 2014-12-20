
public class Main {
	public static void main(String[] args) {
		Tree tree = new Tree();
		//at beginning, max and min allowed integer values
		if(tree.checkIfBST(tree.hardCodedTree1(), Integer.MAX_VALUE, Integer.MIN_VALUE))
		{
			System.out.println("HardcodedTree1 is a BSt\n");
		}
		else
		{
			System.out.println("HardcodedTree1 is not a BSt\n");
		}
		
		if(tree.checkIfBST(tree.hardCodedTree2(), Integer.MAX_VALUE, Integer.MIN_VALUE))
		{
			System.out.println("HardcodedTree2 is a BSt\n");
		}
		else
		{
			System.out.println("HardcodedTree2 is not a BSt\n");
		}
		
		if(tree.checkIfBST(tree.hardCodedTree3(), Integer.MAX_VALUE, Integer.MIN_VALUE))
		{
			System.out.println("HardcodedTree3 is a BSt\n");
		}
		else
		{
			System.out.println("HardcodedTree3 is not a BSt\n");
		}
		
	}

}
