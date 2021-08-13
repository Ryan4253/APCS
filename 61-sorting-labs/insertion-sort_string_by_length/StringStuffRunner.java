//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.ArrayList;
import java.util.Arrays;

public class StringStuffRunner
{
   public static void main(String args[])
	{
		StringStuff s = new StringStuff();
		ArrayList< String> sf;

		String[] test1 = "one eleven11 thirteen 1234 22two three 4four 5five 66it a bee".split(" ");
		sf = new ArrayList< String >(Arrays.asList(test1));		
		s.lengthSort(sf);
		System.out.println(sf);
			
		String[] test2 = "one three z a".split(" ");
		sf = new ArrayList<String>(Arrays.asList(test2));
		s.lengthSort(sf);
		System.out.println(sf);
		
		String[] test3 = "bruh bruh".split(" ");
		sf = new ArrayList<String>(Arrays.asList(test3));
		s.lengthSort(sf);
		System.out.println(sf);																				
	} 
}