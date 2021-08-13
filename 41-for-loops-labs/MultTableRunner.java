//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class MultTableRunner
{
	public static void main ( String[] args )
	{
		MultTable test1 = new MultTable(5, 5);
		MultTable test2 = new MultTable(3, 7);
		MultTable test3 = new MultTable(1, 6);
		MultTable test4 = new MultTable(9, 9);
		MultTable test5 = new MultTable(7, 8);

		test1.printTable();
		test2.printTable();
		test3.printTable();
		test4.printTable();
		test5.printTable();
	}
}