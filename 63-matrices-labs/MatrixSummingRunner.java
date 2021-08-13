//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSummingRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("matsum.dat"));
		//slideshow 13 has info on reading from a file

		MatrixSumming a = new MatrixSumming();
		System.out.println(a);
		
		int n = file.nextInt();

		for(int i = 0; i < n; i++){
			int r = file.nextInt(), c = file.nextInt();
			System.out.println("The sum of " + r + "," + c + " is " + a.sum(r, c) + ".");
		}
	}
}



