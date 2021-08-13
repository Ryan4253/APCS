//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringStuff
{
	private String word;
	private String firstLast;
	private String middle;
	private boolean sameFirstLast;

	public StringStuff( String w ){
		word = w;
	}

 	public String getFirstLastLetters()
 	{
 		String sol = "";
 		sol += word.charAt(0);
 		sol += word.charAt(word.length()-1);
 		return sol;
	}
	
 	public String getMiddleLetter()
 	{

 		return "" + word.charAt(word.length() / 2);
	}	
	
 	public boolean sameFirstLastLetters()
 	{
 		return word.charAt(0) == word.charAt(word.length()-1);
	}	

 	public String toString()
 	{
 		return "" + word;
	}
}