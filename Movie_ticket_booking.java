import java.util.Scanner;
public class Movie_ticket {

	public static void main(String[] args) {
		System.out.println("\n"
				+"-------****-------****-------****-------****---------\n"
				+"       Welcome to The Movie Ticket Program!\n"
				+"-------****-------****-------****-------****---------\n");
		
		Scanner in = new Scanner(System.in);
		int value;
		do {
			System.out.println("Here are some movie you could choose:\n"
					+ "     1 - The Invisible Man\n"
					+ "     2 - Impractical Joker\n"
					+ "     3 - The call of The Wild\n"
					+ "     4 - Sonic The Hedgehog\n"
					+ "     5 - Fantasy Island\n"
					+ "     6 - Quit\n");
			System.out.print("Please enter the digit corresponding to your option: ");
			value = in.nextInt();
		}
		while(!(1<=value && value <=6));
		
		if (value<=5)
		{
			int show;
			do{
				System.out.println("Here is the Schedule for the movie you chose:\n");
			    System.out.println("      1 - IMAX 1:00-3:00\n"
		        		+ "      2 - VIP 2:30-4:30\n"
		        		+ "      3 - ULTRAAVX 2:30-4:30\n"
		        		+ "      4 - Regular 4:45-6:45\n");
			    System.out.print("Please enter the digit corresponding to your option: ");
			    show = in.nextInt();
			    }
			while(!(show >=1 && show <=4));
			
			int general,adult,senior,children;
			double total_price;
			String schedule;
		
			if(show == 1) 
			{
				schedule = "IMAX 1:00-3:00";
				System.out.print("Please enter the number of General: ");
				general = in.nextInt();
				System.out.print("Please enter the number of Children: ");
				children = in.nextInt();
				System.out.print("Please enter the number of Senior: ");
				senior = in.nextInt();
				total_price = 20.99*general + 19.50*senior + 18.5*children;
			
			
			}
			else if (show == 2) 
			{
				schedule = "VIP 2:30-4:30";
				System.out.print("Please enter the number of Adult: ");
				adult = in.nextInt();
				total_price = 19.99*adult;
				
			}
			else if (show == 3) 
			{
				schedule = "ULTRAAVX 2:30-4:30";
				System.out.print("Please enter the number of General: ");
				general = in.nextInt();
				System.out.print("Please enter the number of Children: ");
				children = in.nextInt();
				System.out.print("Please enter the number of Senior: ");
				senior = in.nextInt();
				total_price = general*17.99+ 14.50*senior + 13.5*children;
			}
			else
			{
				schedule = "Regular 2:30-4:30";
				System.out.print("Please enter the number of General: ");
				general = in.nextInt();
				System.out.print("Please enter the number of Children: ");
				children = in.nextInt();
				System.out.print("Please enter the number of Senior: ");
				senior = in.nextInt();
				total_price = general*11.99+ 8.50*senior + 7.75*children;
			}
			
			switch(value) 
			{
			case 1: System.out.println("\nThe movie is: The Invisible Man");
			break;
			case 2: System.out.println("\nThe movie is: Impractical Jokers");
			break;
			case 3: System.out.println("\nThe movie is: The Call of The Wild");
			break;
			case 4: System.out.println("\nThe movie is: Sonic The Hedgehog");
			break;
			case 5: System.out.println("\nThe movie is: Fantasy Island");
			
			}
			
			System.out.println("Your schedule is: "+schedule);
	                System.out.printf("The total price you need to pay is: $%.2f\n",total_price);
			
			
			
			}
		
		
		
		System.out.print("\nThank you for using this program!!");
		in.close();

	}

}
