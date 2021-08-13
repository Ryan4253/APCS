//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MPHRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);

		out.print("Enter the distance :: ");
		int dist = keyboard.nextInt();

		out.print("Enter the hours :: ");
		int hrs = keyboard.nextInt();

		out.print("Enter the minutes :: ");
		int mins = keyboard.nextInt();

		//call the getMPH method and pass in
		MilesPerHour s = new MilesPerHour();

		//the actual parameters needed
		System.out.print(dist + " miles in " + hrs + " hour and " + mins + " minutes = ");
		System.out.println(Math.round(s.getMPH(dist, hrs, mins)) + " MPH.");
	}
}

/*
 
Sample Output : 
Enter the distance :: 45
Enter the hours :: 0
Enter the minutes :: 32

45 miles in 0 hour and 32 minutes = 84 MPH.




Enter the distance :: 96
Enter the hours :: 1
Enter the minutes :: 43

96 miles in 1 hour and 43 minutes = 56 MPH.




Enter the distance :: 100
Enter the hours :: 2
Enter the minutes :: 25

100 miles in 2 hour and 25 minutes = 41 MPH.




Enter the distance :: 50
Enter the hours :: 2
Enter the minutes :: 25

50 miles in 2 hour and 25 minutes = 21 MPH.

*/