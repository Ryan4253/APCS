//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private int number;
	private int count;
	private int globalcount = 0;

	public GuessingGame(){
	}

	public void playGame(){
		Scanner keyboard = new Scanner(System.in);
		count = 0;

		System.out.print("Guessing Game - how many numbers?: ");
		upperBound = keyboard.nextInt();
		number = (int)(Math.random() * upperBound) + 1;

		while(true){
			System.out.print("Enter a number between 1 and " + upperBound + ": ");
			int n = keyboard.nextInt();
			if(n == number){
				count++;
				System.out.println('\n' + "It took " + (count) + " guesses to guess " + number);
				System.out.println("You guessed wrong " + (int)((100.0-(100/count))) + " percent of the time");
				break;
			}
			else if(n > number || n < 1){
				System.out.println("Number out of range!");
			}
			else{
				count++;
			}
		}
	}
}