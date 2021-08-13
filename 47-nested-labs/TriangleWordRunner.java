//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class TriangleWordRunner
{
   public static void main(String args[]){	
   		Scanner keyboard = new Scanner(System.in);
   		System.out.print("Input a Word: ");
   		String s = keyboard.nextLine();
   		TriangleWord word = new TriangleWord(s);
   		System.out.println(word);
	}
}