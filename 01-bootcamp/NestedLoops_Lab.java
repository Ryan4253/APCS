import java.util.Scanner;

public class NestedLoops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );
        
        System.out.print( "Enter the size of the triangle :: ");
        int size = kb.nextInt();
        
        for(int i = 0; i < size; i++){
            for(int j = i; j < size; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //write nested loops that will print out a box of asterisks based on the size
    }
}
