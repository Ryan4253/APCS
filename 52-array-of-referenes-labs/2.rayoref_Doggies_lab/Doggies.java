//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		pups = new Dog[size];
	}
	
	public void set(int spot, int age, String name)
	{
		Dog lmao = new Dog(age, name);
		pups[spot] = lmao;		
	}

	public String getNameOfOldest()
	{
		int index = 0;

		for(int i = 1; i < pups.length; i++){
			if(pups[i].getAge() > pups[index].getAge()){
				index = i;
			}
		}

		return pups[index].getName();
	}

	public String getNameOfYoungest()
	{
		int index = 0;

		for(int i = 1; i < pups.length; i++){
			if(pups[i].getAge() < pups[index].getAge()){
				index = i;
			}
		}

		return pups[index].getName();
	}

	public String toString()
	{
		String sol = "[";
		for(int i = 0; i < pups.length; i++){
			sol += pups[i];
			if(i != pups.length-1){
				sol += ", ";
			}
		}

		return sol + "]";
	}
}