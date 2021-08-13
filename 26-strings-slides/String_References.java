//(c) A+ Computer Science
// www.apluscompsci.com

//string references example

import static java.lang.System.*;

public class String_References
{
	public static void main ( String[] args )
	{
		String x = new String("Chuck");
		String y = x;

		System.out.println(x==y);
			//check to see if x and y store the same memory address

		System.out.println(x.equals(y));
			//check to see if x and y refer to the same value


		x = "Chuck";
		y = "Chuck";

		System.out.println(x==y);
			//check to see if x and y store the same memory address

		System.out.println(x.equals(y));
			//check to see if x and y refer to the same value


		x = new String("Chuck");
		y = new String("Chuck");

		System.out.println(x==y);
			//check to see if x and y store the same memory address

		System.out.println(x.equals(y));
			//check to see if x and y refer to the same value


		x = new String("Chuck");
		y = "Chuck";

		System.out.println(x==y);
			//check to see if x and y store the same memory address

		System.out.println(x.equals(y));
			//check to see if x and y refer to the same value


		x = "Chuck";
		y = x;
		x = null;

		out.println(x);
		out.println(y);
	}
}