//Don't forget to import java classes

import java.util.*;
// see using star doesn't import classes of next level
import java.util.regex.*;
import java.nio.file.*;
import java.io.*;
// name of class same as filename
public class Main
	{
	public static void main(String args[]) throws IOException
	{
	// Syntax of main + printing command line arguments
	System.out.println("The first cmd line argument is: " + args[0]);

	takeUserInput();
        
        regexToExtractString();

	splitString();

	hashmapNStrCase();

	readFile();

	writeFile();

	stringComparisons();

	convertArrayToList();
	}

	public static void takeUserInput()
	{
        System.out.println("Please enter a line and press enter");
        // Taking input from user
	Scanner scannerObj = new Scanner(System.in);
        //nextLine for line. As lines are separated by /n
        System.out.println("User entered: " + scannerObj.nextLine());
	}

        public static void regexToExtractString()
	{
        // Using regex to extract a string which is surrounded by some characters
        // Trying to extract "MacOSx" from "Os:Maxosx-end"
        String originalString = "Os:Maxosx-end";
	String regex = Pattern.quote("Os:") + "(.*?)" + Pattern.quote("-end");
        Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(originalString);	
	matcher.find();
        String extractedString = matcher.group(1);
	System.out.println("The extracted string using regular expression is :" + extractedString);
	}

	public static void splitString()
	{
	// split string and foreach
	String origionlString = "This is first line\r\nThis is second line";
	String strArray [] = origionlString.split("\r\n");
	for(String str : strArray)
		{
		System.out.println(str);
		}
	}

	public static void hashmapNStrCase()
	{
	//usage of hashmaps and string case manipulation
	String originalStrMixedCase = "OriGiOnaL StRinG iS MixeD cAsE";
	String lowerCase = originalStrMixedCase.toLowerCase();
	String upperCase = originalStrMixedCase.toUpperCase();
	HashMap <Integer, String> hashmapObj = new HashMap<Integer, String>();
	hashmapObj.put(1, lowerCase);
	hashmapObj.put(2, upperCase);
	System.out.println("lowercase string: " + hashmapObj.get(1));
	System.out.println("uppercase string: " + hashmapObj.get(2));
	}

	public static void readFile() throws IOException
	{
	// usage of reading a texr file
	byte [] encoded = Files.readAllBytes(Paths.get("simpleTextfile.txt"));
	String fileString = new String(encoded);
	System.out.println("Text of file being read is: " + fileString);
	}

	public static void writeFile() throws IOException
	{
	// usage of writing a text file
	FileWriter fileWriter = new FileWriter("output.txt");
	fileWriter.append("This is a simple text file written using filewriter");
	fileWriter.flush();
	fileWriter.close();
	}

	public static void stringComparisons()
	{
	// some string comparisons
	String str1 = "This is a string";
	String str2 = "THIS IS A STRING";
	String str3 = "This is a string";
	String str4 = "This is a string but acts are superset string";
	if(str1.contentEquals(str3))
	{
	System.out.println("str1 contents same as str3");
	}
	if(str4.contains(str3))
	{
	System.out.println("str4 contains str3");
	}
	// similarly try others http://docs.oracle.com/javase/7/docs/api/java/lang/String.html
	}

	public static void convertArrayToList()
	{
	String origionalString = "hello this is a sample string";
	// here using Arraylist <String> list doens't work as Arrays.asList returns obj of type List<T>
	List<String> list;
	// split method returns an array of strings
	list = Arrays.asList(origionalString.split(" "));
	System.out.println("String being split by spaces, the string array converted to list and print:");
	for(String temp : list)
	{
	System.out.println(temp + "\n");
	}
	}
	
}





























