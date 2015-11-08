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
	// hashmap does not allow duplicate keys hence, if we do put
   //it will replace
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
	
	//getting particular character from string
	String origionalString = scanner.nextLine();
	Character currentCharSequence = origionalString.charAt(0);
	
	//getting string length
	origionalString.length()
	
	//splitting string
	String origionalString = scanner.nextLine();
	String strArray[] = origionalString.split(" ");
	
	//foreach
	String strArray[];
	for(String tmp : strArray)
	{
	newStr = newStr + tmp + "%20";
	}
	
	//getting substring
	String newStr = "";
	newStr = newStr.substring(0,newStr.length()-3);
	
	//character comparison
	String tmpString = "";
	Character currenChar;
	currenChar.equals(tmpString.charAt(j))
	
	//input integer
	Scanner scanner = new Scanner(System.in);
	int numOfRows = scanner.nextInt();
	
	//creating arraylist of integers
	List <Integer> arrZeroRowList = new ArrayList<Integer>();
	
	//creating 2d array
	int matrix[][] = new int[numOfRows][numOfCoumns];
	
	//adding elements in arraylist
	List <Integer> arrZeroColumnList = new ArrayList<Integer>();
	arrZeroRowList.add(i);
	
	//creating hashmaps, comparing hashmaps, checking keys, adding key value pair, getting element using key
	static HashMap<Character,Integer> str1HashMap;
	str1HashMap = new HashMap<Character, Integer>();
	str1HashMap.equals(str2HashMap);
	str1HashMap.containsKey(currentChar);
	str1HashMap.put(currentChar,1);
	str1HashMap.get(currentChar)
	
	//entering boolean from user
	int number = Integer.parseInt(scanner.nextLine(), 2);
	
	// switch syntax
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
	
	//left shift
	int bitNum = scanner.nextInt();
	bitNum = 1<<bitNum;
	
	//logical and
	int temp = 0;
	temp = number&bitNum;
	
	//logical or
	int temp = 0;
	temp = number|bitNum;
	
	//logical negation
	bitNum = ~bitNum;
	
	//printing boolean
	int temp = 0;
	temp = number&bitNum;
	System.out.println("New number is " + Integer.toString(temp,2));
	
	//constructor
	public class Node{
		int data;
		Node next;
		public Node(int value)
		{
		data = value;
		next = null;
		}
	}
	
	// add element to list, list size, printing list, getting element
	static List<Integer> list1;
	list1 = new ArrayList<Integer>();
	list1.add(firstNum%10);
	int diffInLength = list1.size()-list2.size();
	System.out.println(list1);
	sum = list1.get(i)
			
   //checking ref
	Singleton obj1 = getObject();
	Singleton obj2 = getObject();
	//you check if the object references points at the same place in memory by using ==
	if(obj1 == obj2)
		
	//convert string lowercase, string comparison
     String type;
	type = type.toLowerCase();
	type.equals("circle")
	
	//interface
	public interface Shape{
		// interface methods cannot have a body in java 7
		public void draw();
		}
	
	//initializing array, sorting array, array length, enter array elements
	static int[] arr  = {7,6,3,4,0,9,5,99,2,45};
	Arrays.sort(arr);
	double end = arr.length-1;
	while(i<arr.length)
	{
	System.out.println("Enter element at position: " +i);
	arr[i] = scanner.nextInt();
	i++;
	}
	
	//ceil and floor
	Math.ceil((end+start)/2);
	
	//stack class java
	static Stack stack2;
	stack1 = new Stack();
	stack1.push(scanner.nextInt());
	int size = stack1.size();
	if(stack2.isEmpty());
	stack2.add(stack1.pop());
	stack2.pop();
	 stack2.peek();
	 
	// queue class java
	 linked list implements queue interface
	 LinkedList <Node>queue = new LinkedList<Node>();
	queue.add(root);
	(queue.isEmpty();
	temp = queue.remove();
	queue.add(temp.left);
	

}





























