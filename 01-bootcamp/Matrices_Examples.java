import java.util.Scanner;
import java.util. Arrays;

public class Matrices_Examples
{
    public static void main(String[] args) 
    {
        int[][] mat = {{2,3,4,5},
                       {55,66,77},
                       {22,11}};
        
        System.out.println( Arrays.toString( mat[0] ));
        System.out.println( Arrays.toString( mat[1] ));
        System.out.println( Arrays.toString( mat[2] ));
        
        System.out.println( mat[0][0] );
        System.out.println( mat[2][1] );
        System.out.println( mat[1][2] );
        
        
        for( int[] row : mat )
        {
        	  for( int item : row )
        	  {
        	  	  System.out.print( item + " " );
        	  }
        	  System.out.println();
        }
        
    }
}
