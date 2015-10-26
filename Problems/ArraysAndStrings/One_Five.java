/*1.5 Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the orig- inal string, your method should return the original string.*/
// basic logic - I fetch every char from string. currentCharSequence is the character which has contionous sequence. So, if the sequence breaks, I append the character and its count.
import java.util.*;
public class One_Five{
	public static void main(String args[])
	{
	System.out.println("Please enter the string you want to be compressed");
	Scanner scanner = new Scanner(System.in);
	String origionalString = scanner.nextLine();
	String finalString = "";
	Character currentChar;
	Character currentCharSequence = origionalString.charAt(0);
	int sequenceCounter = 0;
	for(int i=0; i<origionalString.length(); i++)
		{
		currentChar = origionalString.charAt(i);
		if(currentChar == currentCharSequence)
			{
			sequenceCounter++;
			}
		else
			{
			finalString = finalString + currentCharSequence + sequenceCounter;
			currentCharSequence = currentChar;
			sequenceCounter = 1;
			}
		}
	finalString = finalString + currentCharSequence + sequenceCounter;
	System.out.println("The compressed string is ");
	System.out.println(finalString.length() < origionalString.length() ? finalString : origionalString);
	}
}