//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the Number of Test Cases :: ");
		int n = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("");
		
		CharacterAnalyzer test = new CharacterAnalyzer();

		for(int i = 0; i < n; i++){
			System.out.print("Enter a letter :: ");
			char letter = keyboard.next().charAt(0);
			test.setChar(letter);
			System.out.println(test);
		}
	}
}