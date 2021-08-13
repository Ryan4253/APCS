//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter 1st monster's name : ");
        String s1 = keyboard.nextLine();

        System.out.print("Enter 1st monster's size : ");
        int a1 = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("Enter 2nd monster's name : ");
        String s2 = keyboard.nextLine();

        System.out.print("Enter 2nd monster's size : ");
        int a2 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.print('\n');
        
        Monster first = new Monster(s1, a1);
        Monster second = new Monster(s2, a2);
        String sol = first.isBigger(second) ? "bigger" : "smaller";

        System.out.println(first);
        System.out.println(second);

        System.out.print("Monster one is ");
        System.out.print(sol);
        System.out.println(" than Monster 2."); 

        if(first.namesTheSame(second)){
        	System.out.println("Monster one has the same name as Monster 2.");
        }
    }
}