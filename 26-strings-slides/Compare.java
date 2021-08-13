//(c) A+ Computer Science
// www.apluscompsci.com

//comparing strings

public class Compare
{
	public static void main(String args[])
	{
		String one = "region";
		String two = "uilstate";
		System.out.println(one.compareTo(two));
		System.out.println(two.compareTo(one));
		two = "region";
		System.out.println(two.compareTo(one));
		
		String o = new String("compsci");
		String t = new String("compsci");		
		System.out.println( o.equals(t) );		
		System.out.println( o.equals("comp") );
	}
}

