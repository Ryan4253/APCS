import java.util.Scanner;

public class Ifs_Examples
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt();
        System.out.println (num);
        
        
        if( num > 10 )
        	 System.out.println( " > 10 " );
        	
        if( num < 10 )
        	 System.out.println( " < 10 " );
        	 
        if (num == 10)
             System.out.println (" == 10 ");
            
        	 

    }
}
