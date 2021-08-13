//(c) A+ Computer Science
// www.apluscompsci.com

//String charAt() method

import static java.lang.System.*;

public class CharAt
{
   public static void main( String args[] )
   {
		String s = "apluscs";
		System.out.print(s.charAt( 0 ) + " ");
		System.out.print(s.charAt( 2 ) + " ");
		System.out.println(s.charAt( s.length()-1 ));
	}
}