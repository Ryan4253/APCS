//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*; 

public class MonsterLabRunner
{
   public static void main( String args[] )
   {
		Scanner keyboard = new Scanner(in);
		
		out.print("How many monsters are in the herd? :: ");
		int size = keyboard.nextInt();
		Monsters herd = new Monsters(size);
		System.out.println();

		for(int i=0; i<size;i++)
		{

			System.out.print("Enter the Ht  :: ");
			int ht = keyboard.nextInt();

			System.out.print("Enter the Wt  :: ");
			int wt = keyboard.nextInt();

			System.out.print("Enter the Age :: ");
			int age = keyboard.nextInt();

			System.out.println();

			Monster lmao = new Monster(ht, wt, age);
			herd.add(i, lmao);		
		}		
		
		System.out.println("\nHERD :: " + herd + '\n');
		System.out.println("Smallest :: " + herd.getSmallest() + '\n');
		System.out.println("Largest :: " + herd.getLargest() + '\n');
	}		
}