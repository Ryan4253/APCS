//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class MilesPerHour
{
	public static double getMPH( int dist, int hrs, int mins )
	{
		double min = mins;
		double hr = hrs;
		hr += min / 60;

		return dist / hr;
	}
}

