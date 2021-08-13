//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

class PasswordCheck
{
	private String password;

	public PasswordCheck(String s){
		password = s;
	}

	public void check()
	{
		String input;
		Scanner keyboard = new Scanner(System.in);
		do{
			System.out.print("Enter the Password: ");
			input = keyboard.nextLine();
			if(input.equals(password)){
				System.out.println("VALID");
				break;
			}
			else{
				System.out.println("INVALID");
			}
		}
		while(true);

	}
}