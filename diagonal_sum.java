import java.util.Scanner;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 a program to add the elements on the two diagonals of a square two dimensional integer
array and display that sum. Ensure that if there is a middle element in the array it is not counted
twice in the sum.
*/


public class diagonal_sum {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the dimension of 2d array: ");
		int size = in.nextInt();
		int [][] values = new int[size][size];
		for(int i=0;i<values.length;i++) 
		{
			System.out.println("Enter "+ size +" numbers for "+(i+1)+" row: ");
			for(int j=0;j<values[i].length;j++)
				values[i][j]=in.nextInt();
		}
		
		//Display the array
		System.out.println();
		for(int i=0; i<values.length;i++) 
		{
			for(int j=0; j<values[i].length;j++)
				System.out.print(values[i][j]+"\t");
			System.out.println();
		}
		
		
			int total1=0;
			int total2=0;
			for(int i =0,j=values.length-1; i < values.length && j>=0;i++,j--) {
				total1 += values[i][i];
				total2 += values[i][j];
			}
			if(values.length%2 != 0)
				total2 -= values[values.length%2][values.length%2];
			
			System.out.println("\n"+total1);
			System.out.println(total2);
	}
			
}
	
	      
		
