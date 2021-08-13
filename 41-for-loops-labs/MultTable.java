//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class MultTable
{
	private int number;
	private int stop;

	public MultTable(int n, int s)
	{
		number = n;
		stop = s;
	}

	public void printTable( )
	{
		System.out.println("multiplication table for " + number);
		for(int i = 1; i <= stop; i++){
			System.out.println("" + i + '\t' + (i * number));
		}
		System.out.print('\n');
	}
}