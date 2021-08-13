
/**
 * Write a description of class Lesson5Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lesson5Project
{
    public static void main (String [] args) {
       double d1 = 37.9;
       double d2 = 1004.128;
       int i1 = 12;
       int i2 = 18;

       double sol1 = 57.2 * (i1 / i2) + 1;
       double sol2 = 57.2 * ((double) i1 / i2) + 1;
       double sol3 = 15 - i1 * (d1 * 3) + 4;
       int sol4 = 15 - i1 * (int)(d1 * 3) + 4;
       int sol5 = 15 - i1 * ((int)d1 * 3) + 4;

       System.out.println("Problem 1: " + sol1);
       System.out.println("Problem 2: " + sol2);
       System.out.println("Problem 3: " + sol3);
       System.out.println("Problem 4: " + sol4);
       System.out.println("Problem 5: " + sol5 + '\n');

    }
}
