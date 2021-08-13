/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		statement = statement.trim();
		if(statement.length() == 0){
			return "Say something, please.";
		}

		if(statement.indexOf("teacher") >= 0){
			response = "Does your teacher like Manchester United?";
		}
		else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0){
			response = "Tell me more about your pet";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if(statement.indexOf("homework") >= 0){
			response = "I am not that smart.";
		}
		else if(statement.indexOf("chicken") >= 0){
			response = "I love chicken, they're so cool!";
		}
		else if(statement.indexOf("school") >= 0){
			response = "What is your favorite subject at school?";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
/*
		if (whichResponse == 0)
		{
			
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
*/
		switch(whichResponse){
			case 0:
				response = "Interesting, tell me more.";
				break;
			case 1:
				response = "Hmmm.";
				break;
			case 2:
				response = "Do you really think so?";
				break;
			case 3:
				response = "You don't say.";
				break;
			case 4:
				response = "Interesting, by the way, how's life?";
				break;
			case 5:
				response = "Do you want to talk about another topic?";
				break;

		}

		return response;
	}
}
