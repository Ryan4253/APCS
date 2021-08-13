// Class: BlackjackRunner
// Purpose: Runner class used to initiate and play blackjack
// @author TAS
// @version December 2020

import static java.lang.System.*;
import java.util.Scanner;
public class BlackjackRunner
{
	public static void main(String[] args)
	{
		// create a new scanner object
		Scanner s = new Scanner(System.in);
		// records the user input
		String response;
		// the game itself is in the class
		Blackjack bj = new Blackjack();


		while(true){
			// plays a round and output score
			bj.playRound();
			// ends the code if prev game ended early (ctr; z / c)
			if(bj.endEarly()){
				System.out.println("I guess you don't want to play anymore. Come back next time!");
				return;
			}
			bj.outputScore();

			System.out.print("Wow, that was fun! You want to play again? (y / n) ");

			while(true){
				// only record response if there is an input, and aborts code if ctrl z / c is typed instead of breaking the code
				if(s.hasNextLine()){
					response = s.nextLine();
				}
				else{
					System.out.println("I guess you don't want to play anymore. Come back next time!");
					return;
				}

				if(response.length() == 0){
				    // prevents charAt(0) breaking the code if its an empty string
					System.out.print("Please pick a valid response. Type y or n: ");
				}
				else if((response.toLowerCase()).charAt(0) == 'y'){ 
					// breaks out of the response while loop if response is y
					//b since outer while loop iterates one more time, one more round will be played
					break;
				}
				else if((response.toLowerCase()).charAt(0) == 'n'){
				    // ends code of response is n
					System.out.println("That was fun, come back if you want more practice!");
					return;
				}
				else{ 
				    // continues to remain in the while loop if an invalid response is given
					System.out.print("Please pick a valid response. Type y or n: ");
				}
			}
		}
	}
}