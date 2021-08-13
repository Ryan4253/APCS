//(c) A+ Computer Science
// www.apluscompsci.com

//String indexOf() method

import static java.lang.System.*;

public class IndexOf
{
   public static void main( String args[] )
   {
		String s = "apluscs";
		int index = s.indexOf("us");
		System.out.println(index);
		index = s.indexOf("c");
		System.out.println(index);
		index = s.indexOf('x');
		System.out.println(index);
		
		index = s.indexOf("pl");
		System.out.println(index);
		index = s.lastIndexOf('c');
		System.out.println(index);
		index = s.lastIndexOf("plus");
		System.out.println(index);
  }
}