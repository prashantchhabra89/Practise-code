//1.1 Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
import java.util.*;
public class One_One{
	public static void main(String args[])
	{
	System.out.println("Please enter the string for which you want to check if it has all unique characters");
	Scanner scanner = new Scanner(System.in);
	String str = scanner.nextLine();
	System.out.println(checkStringUniqueChar(str));
	}
	public static Boolean checkStringUniqueChar(String str)
	{
	String tmpString = "";
	Character currenChar;
	for(int i=0;  i<str.length(); i++)
	{	
		currenChar = str.charAt(i);
		if(i==0)
		{
			tmpString +=currenChar;
			
		}
		else
		{
			for(int j=0; j<tmpString.length(); j++ )
			{
				if(currenChar.equals(tmpString.charAt(j)))
					{return false;}
				
			}
		tmpString +=currenChar;
		}
	}
	return true;
	}
}				
		