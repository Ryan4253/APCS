//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class DigitDromeRunner
{
   public static void main(String args[])
	{
		DigitDrome dd = new DigitDrome( );
		System.out.println( dd.getLeft( 92351 ) );
		System.out.println( dd.getRight( 92351 ) );

		ArrayList<Integer> x;
		x = new ArrayList<Integer>( Arrays.asList( 111, 222, 333, 313, 3234, 44) );

		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );		
			
			
		x = new ArrayList<Integer>( Arrays.asList( 2, 1, 2 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );		
			

		x = new ArrayList<Integer>( Arrays.asList( 2152, 1, 333, 333, 1, 2152 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );	
			

		x = new ArrayList<Integer>( Arrays.asList( 717 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );		
			

		x = new ArrayList<Integer>( Arrays.asList( 81, 77 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );		
			

		x = new ArrayList<Integer>( Arrays.asList( 81, 77, 9 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );	


		x = new ArrayList<Integer>( Arrays.asList( 1,2,3,4,5,6,8,9,81, 77, 9 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );	
			

		x = new ArrayList<Integer>( Arrays.asList( 1,2,3,10,11,12 ) );
		dd = new DigitDrome( );
		dd.createGroup( x );
		System.out.println( dd );
		System.out.println( dd.isPalin() );	

																							
	} 
}