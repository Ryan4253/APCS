//(c) A+ Computer Science
//www.apluscompsci.com
//Name


public class WordRunner
{
	public static void main ( String[] args )
	{
		String a = "Hello";
		String b = "World";
		String c = "Jukebox";
		String d = "TCEA";
		String e = "UIL";

		Word test1 = new Word(a);
		Word test2 = new Word(b);
		Word test3 = new Word(c);
		Word test4 = new Word(d);
		Word test5 = new Word(e);

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test5);
	}
}