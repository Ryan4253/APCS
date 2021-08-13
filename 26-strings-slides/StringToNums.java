//(c) A+ Computer Science
// www.apluscompsci.com

//converting Strings to numbers

import static java.lang.System.*;

public class StringToNums
{
  public static void main (String[] arg)
  {
		int intOne = Integer.parseInt("2343");
		out.println(intOne);
		out.println(intOne/2);
		
		out.println("\n\n");
		
		double decOne = Double.parseDouble("23.78");
		out.println(decOne);
		out.println(decOne/2);		
  }
}