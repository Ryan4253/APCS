//(c) A+ Computer Science
// www.apluscompsci.com

//String concatenation example

import static java.lang.System.*;

public class Concatenate
{
   public static void main( String args[] )
   {
		String one = "apluscomp";
		String two = "-sci";
		
		String s = one.substring(0,4) + two;
		System.out.println(s);
		System.out.println(s.length());
		
		String what = s.concat(two);		//adding strings together
		System.out.println(what);
		System.out.println(what.length());
	}
}