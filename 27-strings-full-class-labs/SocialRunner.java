//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();

		Social st = new Social(word);
		st.chopAndAdd();
		System.out.println(st);
		
		
	}
}