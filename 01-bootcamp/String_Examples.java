import java.util.Scanner;

public class String_Examples
{
    public static void main(String[] args) 
    {
        String word = "comp sci rocks and we need more kids cranking comp sci code!";    
        System.out.println( word );
        System.out.println( word.length() );      
        System.out.println( word.substring(0,1) );        
        System.out.println( word.substring(2,5) );
        System.out.println( word.substring( 27 ) );
        System.out.println( word.indexOf( "sci") );
        System.out.println( word.indexOf( "need") );       
        System.out.println( word.indexOf( "comp") );        
        System.out.println( word.indexOf( "aplus") );
    }
}
