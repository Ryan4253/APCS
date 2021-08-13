import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private char playChoice;
	private char compChoice;

	public RockPaperScissors(char player)
	{
		playChoice = player;
		compChoice = generateComp();
	}

	public char generateComp(){
		int comp = (int) (Math.random() * 3);
		if(comp == 0){
			return 'R';
		}
		else if(comp == 1){
			return 'P';
		}
		else{
			return 'S';
		}
	}

	public String determineWinner()
	{
		//r = rock, p = paper, s = scissors
		if(playChoice == 'R' && compChoice == 'S'){
			return "!Player wins <<Rock Crushes Scissor>>!";
		}
		else if(playChoice == 'R' && compChoice == 'P'){
			return "!Computer wins <<Paper Covers Rock>>!";
		}
		else if(playChoice == 'S' && compChoice == 'P'){
			return "!Player wins <<Scissor Cuts Paper>>!";
		}
		else if(playChoice == 'S' && compChoice == 'R'){
			return "!Computer wins <<Rock Crushes Scissor>>!";
		}
		else if(playChoice == 'P' && compChoice == 'R'){
			return "!Player wins <<Paper Covers Rock>>!";
		}
		else if(playChoice == 'P' && compChoice == 'S'){
			return "!Computer wins <<Scissor Cuts Paper>>!";
		}
		else{
			return "Its a Tie!";
		}
	}

	public String toString()
	{
		return "Player had " + playChoice + "\n" + "Computer had " + compChoice + '\n' + determineWinner();
	}
}