/*1.4 Write a method to replace all spaces in a string with'%20'. You may assume that the string has sufficient space at the end of the string to hold the additional characters, and that you are given the "true" length of the string. (Note: if imple- menting in Java, please use a character array so that you can perform this opera- tion in place.)EXAMPLEInput: "Mr John Smith Output: "Mr%20Dohn%20Smith"*/
import java.util.*;
public class One_Four{
	public static void main(String args[])
	{
	System.out.println("Please enter string which has spaces");
	Scanner scanner = new Scanner(System.in);
	String origionalString = scanner.nextLine();
	String strArray[] = origionalString.split(" ");
	String newStr = "";
	for(String tmp : strArray)
		{
		newStr = newStr + tmp + "%20";
		}
	newStr = newStr.substring(0,newStr.length()-3);
	System.out.println("Output String is: " + newStr);

	}
}
