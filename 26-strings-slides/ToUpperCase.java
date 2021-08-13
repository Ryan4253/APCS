//(c) A+ Computer Science
// www.apluscompsci.com

//String references with toUpperCase

import static java.lang.System.*;

public class ToUpperCase
{
  public static void main (String[] arg)
  {
		String s = "compsci";
		out.println(s);

		s.toUpperCase();    //returns a new String
		out.println(s);

		s=s.toUpperCase();  //s referes to the new String
		out.println(s);

		s=s.toLowerCase();  //s referes to the new String
		out.println(s);
  }
}