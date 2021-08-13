
/**
 * Write a description of class BinaryConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)

 */

import java.util.Scanner;

public class BinaryConversion
{
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
    	System.out.print("Give me a number please: ");
    
    	int n = keyboard.nextInt();
    	int nn = n;
    	String s = "";

    	while(n != 0){
    		s = (n % 2) + s;
    		n /= 2; 
    	}

    	System.out.println("The bianry of " + nn + " is " + s);
   	}
}
