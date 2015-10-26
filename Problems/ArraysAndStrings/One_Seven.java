/*1.7 Write an algorithm such that if an element in an MxN matrix is 0, its entire rowand column are set to 0.*/

import java.util.*;
public class One_Seven{
	public static void main(String args[])
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("please enter number of rows for matrix");
	int numOfRows = scanner.nextInt();
	System.out.println("please enter number of columns for matrix");
	int numOfCoumns = scanner.nextInt();
	int value = 0;
	List <Integer> arrZeroRowList = new ArrayList<Integer>();
	List <Integer> arrZeroColumnList = new ArrayList<Integer>();
	int matrix[][] = new int[numOfRows][numOfCoumns];
	for(int i=0; i<numOfRows; i++)
		{
		for(int j=0; j<numOfCoumns; j++)
			{
			System.out.println("Please enter value for " + i + " row " + j + " column");
			value = scanner.nextInt();
			if(value == 0)
				{
				arrZeroRowList.add(i);
				arrZeroColumnList.add(j);
				}
			matrix[i][j] = value;
			}
		}
	for(int i : arrZeroRowList)
		{
		for(int j=0; j<numOfCoumns; j++)
			{
			matrix[i][j] = 0;
			}
		}
	for(int i : arrZeroColumnList)
		{
		for(int j=0; j<numOfRows; j++)
			{
			matrix[j][i] = 0;
			}
		}
	for(int i=0; i<numOfRows; i++)
		{
		for(int j=0; j<numOfCoumns; j++)
			{
			System.out.print(matrix[i][j]);
			}
		System.out.print("\n");
		}
	
	}
}

