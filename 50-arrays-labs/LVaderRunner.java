//(c) A+ Computer Science
// www.apluscompsci.com

import java.util.Arrays;

public class LVaderRunner
{
   public static void main(String args[])
	{
		//add test code here	\
		LVader ela = new LVader( 7 );
		System.out.println( ela.incNumStops( 9 ) );
		System.out.println( ela.incNumStops( 4 ) );
		System.out.println( ela );
		ela.incNumStops( 6 );
		ela.incNumStops( 3 );
		System.out.println( ela );
		System.out.println( ela.numStops( 8 ) );
		System.out.println( ela.inRange( 11 ) );
		ela.incNumStops( 0 );
		ela.incNumStops( 1 );
		ela.incNumStops( 6 );
		ela.incNumStops( 6 );
		ela.incNumStops( 5 );
		ela.incNumStops( 5 );
		ela.incNumStops( 0 );
		ela.incNumStops( 1 );				
		System.out.println( ela );
		System.out.println( ela.numStops( 6 ) );	
		System.out.println( ela.floorWithMostStops( ) );	
	} 
}