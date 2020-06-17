/* 

Comp248  Java Assignment 3 

Write the implementation of the class Movie as per the specifications that follow.
An object of type Movie stores information about the name, schedule and price of a movie
The class Movie contains:
• Private instance variables of type string to store the name and schedule of the movie and
type double to store the price.
• Three constructors:
o One that takes 3 arguments and sets all of the corresponding instance variables.
o A default constructor, which will set three attributes name, schedule and price
to“Frozen II”, “2:00-5:00pm” and 17.99.
o A copy constructor which sets the instance variables to be the same as the passed
Movie object.
• Public methods to get (accessor) and set (mutator) each instance variable individually.

*/


import java.util.Scanner;

public class Movie {
	
	private String name;
	private String schedule;
	private double price;
	
	public Movie(String name, String schedule, double price) //constructor takes 3 arguments and set them as the attributes
	{
		this.name = name;
		this.schedule = schedule;
		this.price = price;
		
	}
	
	public Movie() //A default constructor, which will set three attributes name, schedule and price 
	{
		this.name = "Frozen II";
		this.schedule = "2:00-5:00pm";
		this.price = 17.99;
	}
	
	public Movie(Movie m) //A copy constructor which sets the instance variables to be the same as the passed Movie object
	{
		this.name = m.name;
		this.schedule = m.schedule;
		this.price = m.price;
	}
	
	//Accessor public method
	
	public String getName() 
	{
		return name;
	}
	
	public String getTime() 
	{
		return schedule;
	}
	
	public double getPrice() 
	{
		return price;
	}
	
	//public Mutator methods
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public void setTime(String schedule) 
	{
		this.schedule = schedule;
	}
	
	public void setPrice(double price) 
	{
		this.price = price;
	}
	
	// A public method addprice to augment price attribute by the p value passed to the method 
	
	public void addPrice(double p) 
	{
		this.price += p;
	}
	
	//toString method to display on the display on the console the movie info 
	
	public String toString() 
	{
		return("Name: "+name+", Schedule: "+schedule+", Price: "+price);
	}
	
	//equals method which tests for the equality of two Movie objects
	
	public boolean equals(Movie m) 
	{
		if(this.name.equals(m.name) && this.schedule.equals(m.schedule) && this.price == m.price)
			return true;
		else
			return false;
	}
	

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println(
				"--------------------------------------------\n"
				+"  Movie Class Driver Program\n"
				+"--------------------------------------------\n");
		
		Movie movie1 = new Movie(); // initialzing movie1 object
		
		// prompt user for the three arguments that will be passed to movie2's object
		System.out.println("Enter the name, schedule and price of movie2 please:");
		String name = in.next();
		String schedule = in.next();
		double price = in.nextDouble();
		
		Movie movie2 = new Movie(name, schedule, price); // creating movie2
		Movie movie3= new Movie(movie2); // creating new object movie3 having the same instances as movie2
		//Displaying the the info of Movie 1 & 2
		System.out.println("\nMovie 1 is The movie info");
		System.out.println(" "+movie1);
		
		System.out.println("\nMovie 2 is The movie info");
		System.out.println(" "+movie2);
		
		//comparing the the attributes of movie2&movie3 using equals method
		System.out.println("\nCompare the two Movie objects (movie2&3)");
		System.out.println("The movie info");
		if(movie2.equals(movie3)) // if the return value is true from the method display the following
		{
			System.out.println(" "+movie2);
			System.out.println(" is equal to");
			System.out.println(" "+movie3);
		}
		
		else 
		{

			System.out.println(" "+movie2);
			System.out.println(" not equal to");
			System.out.println(" "+movie3);
		}
		// prompt user for the three arguments that will be passed to movie1's object
		System.out.println("\nEnter the name, schedule and price of movie1 please:");
		String name1 = in.next();
		String schedule1 = in.next();
		double price1 = in.nextDouble();
		// changing the attribute of movie1
		movie1.setName(name1);
		movie1.setTime(schedule1);
		movie1.setPrice(price1);
		// printing the update movie1 info
		System.out.println("\nTime 1 is now: The movie info");
	    System.out.println(" "+movie1);
	     // increasing the ticket price of movie2 
	     movie2.addPrice( movie3.getPrice()*2);

	     System.out.println("\nAfter increasing the price movie2:");
	     System.out.println("The price of movie2 is now "+movie2.getPrice());
	     System.out.println("The price of movie3 is now "+movie3.getPrice());
	      
	     String sum = String.format("%.2f", (movie1.getPrice()+movie2.getPrice()+movie3.getPrice())); // storing the sum of all the ticket price in string format
	     System.out.println("\nThe total price of movie1,2 and 3 are: "+sum);
	     System.out.println("Thank you for using this program!");
		
		
		in.close();
		
		
		
	}
	

}
