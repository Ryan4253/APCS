//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class TriplesRunner
{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Input a Number: ");
		int n = s.nextInt();
		Triples a = new Triples(n);
		a.printTriples();
	}
}