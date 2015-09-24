/*2.5You have two numbers represented by a linked list, where each node contains a singledigit.Thedigitsarestoredinreverseorder,suchthatthe 1'sdigitisat thehead of the list. Write a function that adds the two numbers and returns the sum as a linked list.*/
//basic Logic - first make two list of equal sizes by adding zero's and then add but take care of carry
import java.util.*;
public class Two_Five{
	static int firstNum;
	static int secondNum;
	static List<Integer> list1;
	static List<Integer> list2;
	static List<Integer> list3;
	public static void main(String args[])
	{
	System.out.println("Please enter first number");
	Scanner scanner = new Scanner(System.in);
	firstNum = scanner.nextInt();
	System.out.println("Please enter second number");
	secondNum = scanner.nextInt();
	list1 = new ArrayList<Integer>();
	list2 = new ArrayList<Integer>();
	list3 = new ArrayList<Integer>();
	while(firstNum!=0)
		{
		list1.add(firstNum%10);
		firstNum = firstNum/10;
		}
	while(secondNum!=0)
		{
		list2.add(secondNum%10);
		secondNum = secondNum/10;
		}
	System.out.println("first number in reverser order in list :" + list1);
	System.out.println("second number in reverser order in list :" + list2);
	makeSameSizeLists();
	addNums();	
	}
	
	public static void makeSameSizeLists()
	{
	int diffInLength = list1.size()-list2.size();
	for(int i=0; i<diffInLength; i++)
		{
		list2.add(0);
		}
	for(int j=0; j>diffInLength; j--)
		{
		list1.add(0);
		}
	System.out.println("lists after making them of same length\nfirst number in reverser order in list :" + list1);
	System.out.println("second number in reverser order in list :" + list2);
	}

	public static void addNums()
	{
	int carry = 0;
	int sum;
	for(int i=0; i<list1.size(); i++)
		{
		sum = list1.get(i)+list2.get(i) + carry;
		if(sum<10)
			{
			list3.add(sum);
			carry = 0;
			}
		else
			{
			carry = sum/10;
			list3.add(sum%10);
			}
		}
	list3.add(carry);
	System.out.println("sum in reverse order of digits :" + list3);
	}
}