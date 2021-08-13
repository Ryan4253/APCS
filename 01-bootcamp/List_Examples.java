import java.util.List;
import java.util.ArrayList;

public class List_Examples
{
    public static void main(String[] args) 
    {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add( 40 );
        nums.add( 30 );
        nums.add( 10 );

        System.out.println( nums );
        System.out.println( "size == " + nums.size() );

        nums.add( 0, 2 );
        nums.add( 7 );
        System.out.println( nums.get( 0 ) );
        System.out.println( nums );

        nums.set( 0, 99 );
        System.out.println( nums );   

        nums.remove( 3 );
        System.out.println( nums );  

        for( int item : nums )	
            System.out.println( item );     
    }
}
