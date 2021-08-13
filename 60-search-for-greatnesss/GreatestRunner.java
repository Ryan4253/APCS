
/**
 * Write a description of class GreatestRunner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class GreatestRunner
{
    public static void main (String [] args) {
       // Complete make some tests for both searches
       // Manchester United and also Baby City.
       // if you search for Manchester United you should return 12
       // when you search for Baby City you should return a negative value
    	GreatestSearch gs = new GreatestSearch();
    	System.out.println(gs.linearSearch("Manchester United"));
    	System.out.println(gs.binarySearch("Manchester United"));
    	System.out.println(gs.linearSearch("Baby City"));
       	System.out.println(gs.binarySearch("Baby City"));

       // Use the toString method so that all the teams are printed
       	System.out.println(gs);
    }
}
