import java.util.*;
public class BasicBitManipulation{
	static int number;
	static Scanner scanner;
	public static void main(String args[])
	{
	int input = 1;
	System.out.println("Enter the origional number");
	scanner = new Scanner(System.in);
	number = Integer.parseInt(scanner.nextLine(), 2);
	while(input!=0)
		{
		System.out.println("Enter 1 to get a bit, 2 to set, 3 to clear 0 to exit");
		input = scanner.nextInt();
		switch (input)
			{
			case 1 : getBit();
			break;
			case 2 : setBit();
			break;
			case 3 : clearBit();
			break;
			case 0: 
			break;
			default : System.out.println("You pressed an invalid option");
			}
		}
	}
	public static void getBit()
		{
		System.out.println("which bit you wanna get? bit naming starts from 0");
		scanner = new Scanner(System.in);
		int bitNum = scanner.nextInt();
		bitNum = 1<<bitNum;
		int temp = 0;
		temp = number&bitNum;
		if(temp == 0)
			{
			System.out.println("That bit is 0");
			}
		else
			{
			System.out.println("That bit is 1");
			}
		}
	public static void setBit()
		{
		System.out.println("which bit you wanna set? bit naming starts from 0");
		scanner = new Scanner(System.in);
		int bitNum = scanner.nextInt();
		bitNum = 1<<bitNum;
		int temp = 0;
		temp = number|bitNum;
		System.out.println("New number is " + Integer.toString(temp,2));
		}
	public static void clearBit()
		{
		System.out.println("which bit you wanna clear? naming starts from 0");
		scanner = new Scanner(System.in);
		int bitNum = scanner.nextInt();
		bitNum = 1<<bitNum;
		bitNum = ~bitNum;
		int temp = 0;
		temp = number&bitNum;
		System.out.println("New number is " + Integer.toString(temp,2));

		}

}
