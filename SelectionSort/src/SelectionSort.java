import java.util.Scanner;


public class SelectionSort {
	Scanner scanner = new Scanner( System.in );
	int arr[];
	public void initialzieArray(int size)
	{
		arr= new int[size];
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
	{//we basically remainder array me se smallest dhoondte hain and usko uski sahi position
		//par laga dete hain
		//initially we dont have any sorted array
		//when i becomes =1, we have a sorted array but that array has only one element
		//at i=0
		int smallest=0;
		for(int i=0; i<arr.length-1;i++)
		{
			for(int j=i;j<=arr.length-1;j++)
			{
				if(arr[smallest]>arr[j])
				{
					smallest=j;
				}
			}
			swap(smallest,i);
		}
	}
	private void swap(int x, int y)
	{
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}


}
