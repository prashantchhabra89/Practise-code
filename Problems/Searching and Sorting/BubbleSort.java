import java.util.*;
public class BubbleSort{
	static int[] arr  = {7,6,3,4,0,9,5,6,2,3};;
	static Scanner scanner;
	public static void main (String args[])
	{
	
	System.out.println("Press 2 if you want to enter an array to be sorted or 1 to use this array" + Arrays.toString(arr));
	scanner = new Scanner(System.in);
	int input = scanner.nextInt();
	if(input==2)
		{
		enterArrayElements();
		}
	bubbleSort();
	System.out.println("This is the sorted array\n" + Arrays.toString(arr));
	}
	public static void bubbleSort()
		{
		for(int j=0; j<arr.length; j++)
			{
			for(int i=0; i<arr.length-j-1; i++)
				{
				if(arr[i]>arr[i+1])
					{
					swap(i,i+1);
					}
				}
			}
		}
	
	public static void swap(int x, int y)
		{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
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