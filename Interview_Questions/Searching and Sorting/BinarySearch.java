import java.util.*;
public class BinarySearch{
	static int[] arr  = {7,6,3,4,0,9,5,99,2,45};
	static Scanner scanner;
	public static void main (String args[])
	{

		System.out.println("Press 2 if you want to enter an array or 1 to use this array" + Arrays.toString(arr));
		scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		if(input==2)
		{
			enterArrayElements();
		}
		Arrays.sort(arr);
		System.out.println("enter element to be searched");
		System.out.println(binarySearch(scanner.nextInt()));
	}

	public static Boolean binarySearch(int target)
	{
		double start = 0;
		double end = arr.length-1;
		int middle = 0;;
		while(start<=end)
		{
			middle = (int)Math.ceil((end+start)/2);
			if(arr[middle] == target)
			{
				return true;
			}
			else
			{
				if(target>arr[middle])
				{
					start = middle+1;
				}
				else
				{
					end = middle-1;
				}
			}
		}
		return false;
	}
	public static void enterArrayElements()
	{
		int i = 0;
		scanner = new Scanner(System.in);
		System.out.println("You will enter 10 elements");
		while(i<arr.length)
		{
			System.out.println("Enter element at position: " +i);
			arr[i] = scanner.nextInt();
			i++;
		}
	}
}