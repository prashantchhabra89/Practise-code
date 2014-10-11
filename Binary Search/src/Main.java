import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World");
        Scanner scanner = new Scanner( System.in );
        BinarySearch binarySearch = new BinarySearch();
    	int option=10;
    	while(option!=0)
    	{
    		System.out.println("\n1 to specify element to search, 0 for exit,");
    		option=scanner.nextInt();
    		if(option == 1)
    		{
    			System.out.println("Which element u wanna search?");
    			binarySearch.specifyElementToSearch(scanner.nextInt());
    			if(binarySearch.search())
    			{
    				System.out.println("element found");
    			}
    			else
    			{
    				System.out.println("element not found");
    			}
    			
    		}
    		

    	}
    }

}
