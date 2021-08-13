//(c) A+ Computer Science
// www.apluscompsci.com

public class CoolChickenRunner
{
   public static void main(String args[])
	{
		CoolChicken a = new CoolChicken( 5.9, 7, "coolio" );
		System.out.println( a.isCool() );

		CoolChicken b = new CoolChicken( 150.5, 5, "foghorn" );
		System.out.println( b.isCool() );

		CoolChicken c = new CoolChicken( 314.1, 5, "notcool" );
		System.out.println( c.isCool() );

		CoolChicken d = new CoolChicken( 212, 56, "ralph" );
		System.out.println( d.isCool() );	

	}
}

