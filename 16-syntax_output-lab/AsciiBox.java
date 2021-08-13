    //� A+ Computer Science  -  www.apluscompsci.com
//Name - Ryan Liao
//Date - 9/7/2020
//Class - AP Computer Science B4
//Lab  - Ascii Box
import java.util.Scanner;

public class AsciiBox
{
    public static void main(String[] args)
    {
    	
        System.out.println("Name: \t Ryan Liao \nDate: \t 9/7/2020");
        System.out.println("+++++++++++++++++++++++++" );
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Size of the Box: ");
        int n = s.nextInt();
        
        System.out.print("Enter the Ascii Character to Use: ");
        char lmao = s.next().charAt(0);
        s.close();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                    System.out.print(lmao);
			}
	    	System.out.print("\n");
		}
	System.out.print("\n");
    }
}