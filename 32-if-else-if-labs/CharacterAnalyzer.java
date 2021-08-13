//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		theChar = '0';
	}

	public CharacterAnalyzer(char c)
	{
		theChar = c;
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		return theChar >= 65 && theChar <= 90;
	}

	public boolean isLower( )
	{
		return theChar >= 97;
	}
	
	public boolean isNumber( )
	{
		return theChar >= 48 && theChar <= 57;
	}

	public String type(){
		if(isUpper()){
			return "an Uppercase character";
		}
		else if(isLower()){
			return "a lowercase character";
		}
		else{
			return "a number";
		}
	}	

	public int getASCII( )
	{
		return theChar;
	}

	public String toString()
	{
		return ""+ getChar() + " is " + type() + ". ASCII == " + getASCII() + "\n";	  
	}
}