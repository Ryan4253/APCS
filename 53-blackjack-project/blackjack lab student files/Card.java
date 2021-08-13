// Class: Card
// Purpose: Defines one standard playing card
// @author TAS
// @version December 2020

public class Card
{
	public static final String[] SUITS = {"CLUBS", "HEARTS", "DIAMONDS", "SPADES"};
    public static final String[] FACES = {"NOT USED","ACE","TWO","THREE","FOUR",
            "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

	//instance variables
	private String suit;
	private int face;

  	//constructor
  	public Card(String s, int f)
  	{
  		suit = s;
  		face = f;
  	}

	// modifiers
	public void setFace(int f)
	{
		face = f;
	}

	public void setSuit(String s)
	{
		suit = s;
	}

	public String getSuit()
	{
		return suit;
	}

	public int getFace()
	{
		return face;
	}

	public int getValue()
	{
		if(getFace() == 1) // ACE
			return 11;
		else if (getFace() >= 11 && getFace() <= 13) // Face card
			return 10;
		else // for all others, point value is just the index into the FACES array
			return getFace();
	}

  	public String toString()
  	{
  		return FACES[face] + " of " + suit + " (" + getValue() + ")";
  	}
 }