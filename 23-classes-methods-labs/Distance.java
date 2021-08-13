//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Distance
{
	public static double getDistance(int xOne, int yOne, int xTwo, int yTwo )
	{
		int diffx = xOne - xTwo;
		int diffy = yOne - yTwo;
		double sol = Math.sqrt(diffx * diffx + diffy * diffy);
		return sol;	
	}
}