
import java.util.Scanner;
public class arrayprogram {

	public static void main(String[] args) {
		System.out.println("\n"
				+"--------------------------------------------\n"
				+"  Welcome to a 2D Array Program!\n"
				+"--------------------------------------------\n");
		
		Scanner in = new Scanner(System.in);
		int size;
		
		do {
			System.out.print("What size square array do you want? (must be >= 3) ");
			size = in.nextInt();
		}while(!(size>=3)); //using do while to prompt user for a input until they enter an interger greater than 3
		
		char[][] list=new char[size][size]; //initializing the array
		System.out.println("Please enter "+ size +" sentences:");
		//asking user to enter the n sentences
		for(int i = 0; i<size; i++) 
		{
			String sen=in.next(); // prompting user for input
			for(int j=0; j<size;j++) // storing each character from the string in the array
				list[i][j]=sen.charAt(j);
		}
		
		//Displaying the array
		System.out.println("\nThe Array looks like the following:");
		for(int i =0;i<size;i++) {
			for(int j = 0; j<size;j++)
				System.out.print(list[i][j]+"\t");
			System.out.println();
			}
		
		//Displaying the sum of all the elements of NXN array
		String sum = "";
		for(int i = 0; i<size;i++)
			for(int j=0;j<size;j++)
				sum+=list[i][j];
		System.out.println("\nSum of all the elements of the "+size+"x"+size+" array is "+sum);
		
		//Displaying first diagonal of the square array
		System.out.println("\nDiagonal from top left to bottom right contains:");
		String diag1 = ""; //Initializing variable that will store the value of diagonal sum
		for(int i = 0; i < size; i++) {
			diag1 += list[i][i]; //storing the sum 
			System.out.print(list[i][i]+"\t"); //printing the first diagonal
		}
		System.out.println("\t"+"Sum is "+diag1);
		
		//Displaying Second diagonal of the square array
		System.out.println("\nDiagonal from top right to bottom left contains:");
		String diag2 = ""; //Initializing variable that will store the value of diagonal sum
		for(int i = 0, j=size-1; i < size && j >= 0; j--,i++) 
		{
			diag2 += list[i][j]; //storing the sum
			System.out.print(list[i][j]+"\t");// print the second diagonal
		}
		System.out.println("\t"+"Sum is "+diag2);
		
		//Displaying the top row of the square array
		System.out.println("\nTop row contains:");
		String top = ""; //Initializing variable that will store the value of top row sum
		for(int j = 0; j < size; j++)
		{
			top += list[0][j];
			System.out.print(list[0][j]+"\t");
		}
		System.out.println("\t"+"Sum is "+top);
		
		//Displaying the bottom row of the square array
		System.out.println("\nBottom row contains:");
		String bottom = ""; //Initializing variable that will store the value of bottom sum
		for(int j = 0; j < size; j++)
		{
			bottom += list[size-1][j];
			System.out.print(list[size-1][j]+"\t");
		}
		System.out.println("\t"+"Sum is "+bottom);
		
		
		//Displaying the First column of the square array
		System.out.println("\nFirst column contains:");
		String col1 = "";
		for(int j = 0; j < size; j++)
		{
			col1 += list[j][0];
			System.out.print(list[j][0]+"\t");
		}
		System.out.println("\t"+"Sum is "+col1);
		
		//Displaying the Last column of the square array
		System.out.println("\nLast column contains:");
		String col2 = "";
		for(int j = 0; j < size; j++)
		{
			col2 += list[j][size-1];
			System.out.print(list[j][size-1]+"\t");
		}
		System.out.println("\t"+"Sum is "+col2);
		
		System.out.println("\nThank you for using 2D-Array Program!");

	}

}
