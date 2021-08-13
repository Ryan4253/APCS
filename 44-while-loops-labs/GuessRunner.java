//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		GuessingGame game = new GuessingGame();

		char response;

		do{
				game.playGame();
				System.out.print("\n\n" + "Do you want to play again? ");
				response = keyboard.nextLine().charAt(0);
		}
		while(response == 'y');
	}
}