//A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangleRunner
{
	public static void main( String args[] ) throws IOException{
		Scanner file = new Scanner (new File("triangle.dat"));
		int n = file.nextInt();
		PascalsTriangle p;
		for(int i = 0; i < n; i++){
			int size = file.nextInt();
			p = new PascalsTriangle(size);
			p.createTriangle();
			System.out.println(p);
		}
	}
}



