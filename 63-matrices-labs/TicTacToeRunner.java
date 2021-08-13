//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToeRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("tictactoe.dat"));
		int n = file.nextInt();  file.nextLine();
		TicTacToe test;
		for(int i = 0; i < n; i++){
			String s = file.nextLine();
			test = new TicTacToe(s);
			System.out.println(test);
		}
	}
}