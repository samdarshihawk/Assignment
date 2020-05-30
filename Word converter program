import java.util.Scanner;
public class Word_converter {

	public static void main(String[] args) {
		
		System.out.println("\n"
				+"-------****-------****-------****-------****------------\n"
				+"       Welcome to Word Converter Program!\n"
				+"-------****-------****-------****-------****------------\n");
	
		Scanner in = new Scanner(System.in);
		String str; //initializing the variable to store the user input(later)
		boolean condition; // this variable will store whether the string has a correct separator 
		do {
			System.out.println("Please enter the Capital and Country name separated by @:");
			str = in.nextLine(); // prompt user for input
			condition = str.contains("@"); // check whether the input has the correct separator or not
		}
		while(!condition);  // if the string has correct separator then the condition becomes false will break the while loop
		int seperator = str.indexOf("@"); // this variable will store the index value of '@'
		String capital = str.substring(0,seperator).toUpperCase(); //
		capital = capital.substring(0,1)+capital.substring(1).toLowerCase();
		String country = str.substring(seperator+1).toUpperCase();
		country = country.substring(0,1)+country.substring(1).toLowerCase();
		System.out.printf("The Capital of %s is %s.\n",country,capital);
		
		System.out.println("\nThank you for using this program!!");
		in.close();
		

	
	}

}
