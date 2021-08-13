//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class Monster
{
	private String name;
	private int howBig;	

	public Monster(String n, int size)
	{
		name = n;
		howBig = size;
	}

	public String getName()
	{
		return name;
	}
	
	public int getHowBig()
	{
		return howBig;
	}
	
	public boolean isBigger(Monster other)
	{
		return howBig > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return !isBigger(other);
	}

	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}
	
	public String toString()
	{
		return name + " " + howBig;
	}
}