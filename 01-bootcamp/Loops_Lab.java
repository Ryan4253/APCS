import java.util.Scanner;

public class Loops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter a starting number :: ");
        int numOne = kb.nextInt();
        
        System.out.print( "Enter an ending number :: ");
        int numTwo = kb.nextInt();
        

        for(int i = numOne; i <= numTwo; i++){
        	System.out.print(i + " ");
        }
        System.out.print("\n");
        //write a loop that will print out all of the numbers from numOne to numTwo inclusive of both
    }
}
