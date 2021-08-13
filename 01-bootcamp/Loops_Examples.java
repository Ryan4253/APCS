import java.util.Scanner;

public class Loops_Examples
{
    public static void main(String[] args) 
    {
        int x = 10;
        while ( x > 0 )
        {
          System.out.println( x );
          x = x - 2;
        }
        
        for( int y = 2; y < 20; y+=2 )
        {
        	 System.out.print( y + " "  );
        }
        
    }
}
