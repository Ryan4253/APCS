//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;

public class Monsters
{
	private Monster[] myMonsters;

	public Monsters(int size){
		myMonsters = new Monster[size];
	}

	public void add(int spot, Monster m)
	{
		myMonsters[spot] = m;
	}

	public Monster getLargest( )
	{
		int index = 0;
		for(int i = 1; i < myMonsters.length; i++){
			if(myMonsters[i].getHeight() > myMonsters[index].getHeight()){
				index = i;
			}
		}

		return myMonsters[index];
	}

	public Monster getSmallest( )
	{
		int index = 0;
		for(int i = 1; i < myMonsters.length; i++){
			if(myMonsters[i].getHeight() < myMonsters[index].getHeight()){
				index = i;
			}
		}

		return myMonsters[index];
	}

	public String toString()
	{
		String sol = "[";

		for(int i = 0; i < myMonsters.length; i++){
			sol += myMonsters[i].toString();
			if(i != myMonsters.length-1){
				sol += ", ";
			}
		}

		return sol + "]";

	}
}