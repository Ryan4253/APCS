import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		char response;
		char status;

		while(1 == 1){
			System.out.print("Rock-Paper-Scissors - pick your weapon[R,P,S]:: ");
			response = keyboard.nextLine().charAt(0);

			if(response == 'R' || response == 'P' || response == 'S'){
				RockPaperScissors game = new RockPaperScissors(response);
				System.out.println(game);

				System.out.print("Do you want to play again? (Y, N) ");
				status = keyboard.nextLine().charAt(0);
				if(status == 'N'){
					return;
				}
			}
			else{
				System.out.println("Invalid Option!");
			}

			System.out.print('\n');
		}
	}
}



