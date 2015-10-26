// 1.3 Given two strings, write a method to decide if one is a permutation of the other.
/* basic Logic - I create hashmaps for 2 strings which contain their character and their count. If both hashmaps turn out to be same, then we know that the two strings are permutation of each other.*/
import java.util.*;
public class One_Three{
	static String str1;
	static String str2;
	static HashMap<Character,Integer> str1HashMap;
	static HashMap<Character,Integer> str2HashMap;
	public static void main(String args[])
	{
	str1HashMap = new HashMap<Character, Integer>();
	str2HashMap = new HashMap<Character, Integer>();
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter first string");
	str1 = scanner.nextLine();
	System.out.println("Please enter second string");
	str2 = scanner.nextLine();
	if(checkIfStrArePermutaion() == false)
	{
		System.out.println("No these two strings are not permutation of each other");	
	}
	else
	{
		System.out.println("Yes these two strings are permutation of each other");
	}
	}

	public  static Boolean checkIfStrArePermutaion()
	{
	genHashMapForStrings();
	return str1HashMap.equals(str2HashMap);
	}

	public static void genHashMapForStrings()
	{
	Character currentChar;
	int currentCountOfChar;
	for(int i=0; i<str1.length();i++)
		{
		currentChar = str1.charAt(i);
		if(!(str1HashMap.containsKey(currentChar)))
			{
			str1HashMap.put(currentChar,1);
			}
		else
			{
			currentCountOfChar = str1HashMap.get(currentChar);
			currentCountOfChar++;
			str1HashMap.put(currentChar,currentCountOfChar);
			}
		}	
	

	for(int j=0; j<str2.length();j++)
		{
		currentChar = str2.charAt(j);
		if(!(str2HashMap.containsKey(currentChar)))
			{
			str2HashMap.put(currentChar,1);
			}
		else
			{
			currentCountOfChar = str2HashMap.get(currentChar);
			currentCountOfChar++;
			str2HashMap.put(currentChar,currentCountOfChar);
			}
		}	
	}
}
