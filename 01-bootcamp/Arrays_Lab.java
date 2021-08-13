import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Lab
{
    public static void main(String[] args) 
    {
        int[] rayOne = {2,3,4,5,6,7,8,9,0,11,2,3,4,5,3};
        
        //write a loop to print out every other number in the array
        for(int i = 0; i < rayOne.length; i++){
            
            if(i % 2 == 0){
                System.out.print(rayOne[i] + " ");
            }
        }
        System.out.print("\n");
        //write a loop to print out all of the numbers backwards
        for(int i = rayOne.length - 1; i >= 0; i--){
            System.out.print(rayOne[i] + " ");
        }
        System.out.print("\n");
    }
}
