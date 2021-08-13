import java.util.Scanner;

public class Ifs_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter an integer :: ");
        int num = kb.nextInt();
        
        if(num % 2 == 0){
        	System.out.println("even");
        }
        else{
        	System.out.println("odd");
        }
    }
}
