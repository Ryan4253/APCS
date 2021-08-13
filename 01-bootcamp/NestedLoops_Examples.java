import java.util.Scanner;

public class NestedLoops_Examples
{

    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter the size of the box :: ");
        int size = kb.nextInt();
        
        for( int i = 0; i < size; i++)
        {
        	  for( int j=0; j < size; j++ )
        	  {
        	  	  System.out.print( "#" );
        	  }
        	  System.out.println();
        }
    }
}
