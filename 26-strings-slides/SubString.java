//(c) A+ Computer Science
// www.apluscompsci.com

//String substring() method

import static java.lang.System.*;

public class SubString
{
   public static void main( String args[] )
   {
		String s = "apluscs" , sub ="";
		
		sub = s.substring(3);
		System.out.println(sub);
		
		sub = s.substring(0,3);
		System.out.println(sub);
		
		sub = s.substring(4);
		System.out.println(sub);
		
		sub = s.substring(3);
		System.out.println(sub);
		
		sub = s.substring(2,5);
		System.out.println(sub);
		
		sub = s.substring(4,6);
		System.out.println(sub);
		
		sub = s.substring(0,1);
		System.out.println(sub);
		
		sub = s.substring(1,2);
		System.out.println(sub);
		
		sub = s.substring(2,3);
		System.out.println(sub);

   }
}

