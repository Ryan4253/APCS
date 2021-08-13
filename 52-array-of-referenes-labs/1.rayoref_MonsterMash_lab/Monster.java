//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monster
{
	private int height;
	private int weight;
	private int age;

	public Monster(int a, int b, int c){
		height = a;
		weight = b;
		age = c;
	}

	public int getHeight(){
		return height;
	}

	public String toString(){
		return height + " " + weight + " " + age;
	}
}