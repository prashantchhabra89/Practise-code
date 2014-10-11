//refered to wikpedia code
public class BinarySearch {
	private int target;
	private int arr[] = {10,20,30,40,50,60,70,80,90};
	public void specifyElementToSearch(int x)
	{
		target = x;
	}
	public boolean search()
	{
		int min=0;
		int max=arr.length-1;
		int middle = (min+max)/2;
		while(min<=max)
		{
			middle = (min+max)/2;
			if (arr[middle]==target)//if it is middle element we return true
				//so we will return true only if we find it to be our middle element
				//dats why while loop that condition..when min =0 and mx =1 and out search element is at 0 then middle =1
				//then max becomes 0 and in that case also we need to run while loop
				return true;
			if(arr[middle]>target)
			{
				max=middle-1;//so now obviously our middle element is not search element
				//hence our array becomes min to middle-1
			}
			else
				min=middle+1;
		}
		return false;
	}
		
}