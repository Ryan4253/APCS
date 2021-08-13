import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Examples
{
    public static void main(String[] args) 
    {
        int[] rayOne = {2,3,4,5,6,7,8,9,0,11,2,3,4,5,3};
        
        System.out.println( Arrays.toString( rayOne ) );
        
        System.out.println( rayOne[0] );
        
        System.out.println( "length == " + rayOne.length );
        
        rayOne[3] = 1000;
        
        rayOne[ 8 / 3 ] = 90;
        
        for( int item : rayOne )
          System.out.print( item + " " );
    }
}
