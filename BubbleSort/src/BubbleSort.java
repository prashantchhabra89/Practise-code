import java.util.Scanner;


public class BubbleSort {
	Scanner scanner = new Scanner( System.in );
	int arr[];
	public void initialzieArray(int size)
	{
		arr= new int[10];
		int i=0;
		while(i<size)
		{
			System.out.println("\nEnter Element");
			arr[i] = scanner.nextInt();
			i++;
		}
		sort();
	}
	public void display()
	{
		int i=0;
		while(i<arr.length)
		{
			System.out.println("\n"+arr[i]);
			i++;
		}
	}
	private void sort()//if not called by other class make private
	{
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<=arr.length-i-2;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(j,j+1);
				}
			}
		}
	}
	private void swap(int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

}
