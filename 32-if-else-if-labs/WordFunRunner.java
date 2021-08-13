//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordFunRunner
{
	public static void main( String args[] )
	{
	   WordFun test = new WordFun("Hello World");
	   test.getWord();
	   System.out.println(test);
	   test.makeUpper();
	   System.out.println(test);
	   test.addHyphen();
	   System.out.println(test);

	   WordFun test1 = new WordFun("Jim Bob");
	   test1.getWord();
	   System.out.println(test1);
	   test1.makeUpper();
	   System.out.println(test1);
	   test1.addHyphen();
	   System.out.println(test1);

	   WordFun test2 = new WordFun("Computer Science");
	   test2.getWord();
	   System.out.println(test2);
	   test2.makeUpper();
	   System.out.println(test2);
	   test2.addHyphen();
	   System.out.println(test2);

	   WordFun test3 = new WordFun("UIL TCEA");
	   test3.getWord();
	   System.out.println(test3);
	   test3.makeUpper();
	   System.out.println(test3);
	   test3.addHyphen();
	   System.out.println(test3);

	   WordFun test4 = new WordFun("State Champions");
	   test4.getWord();
	   System.out.println(test4);
	   test4.makeUpper();
	   System.out.println(test4);
	   test4.addHyphen();
	   System.out.println(test4);

	}
}