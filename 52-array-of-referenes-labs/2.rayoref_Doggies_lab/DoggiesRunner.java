//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;

public class DoggiesRunner
{
   public static void main( String[] args )
   {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("How many Dogs are in the pack? :: ");
		int size = keyboard.nextInt();
		Doggies pack = new Doggies(size);

		for(int i=0; i<size;i++)
		{
			System.out.print("\nEnter the age :: ");
			int age = keyboard.nextInt();
			keyboard.nextLine();
			System.out.print("Enter the name :: ");
			String name = keyboard.nextLine();

			pack.set(i, age, name);
			
		}		

		System.out.println("\n\npack :: "+ pack + '\n');
		System.out.println("NAME OF OLDEST :: "+ pack.getNameOfOldest());
		System.out.println("NAME OF YOUNGEST :: "+ pack.getNameOfYoungest());		
	}		
}