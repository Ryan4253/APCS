//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class FibonacciRunner
{
	public static void main(String args[])
	{
		System.out.println("Type Ctrl + C to quit code");
		Fibonacci test = new Fibonacci();
		Scanner s = new Scanner(System.in);
		while(s.hasNext()){
			String t = s.nextLine();
			if(t.length() >= 12 && (t.substring(0, 12)).equals("set size to ")){
				test.setLimit(t.substring(12));
			}
			else{
				System.out.println(test.getNum(t));
			}
		}
	}
}