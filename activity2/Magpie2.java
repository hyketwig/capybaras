/*
How it responds to:
a) My mother and I talked last night.
   Tell me more about your family.
b) I said no!
	Why so negative?
c) The weather is nice.
    Hmmm.
d) Do you know my brother?
   Why so negative?
   
Keyword --- Response
1. like --- Tell me more about your interests.
2. winter/spring/summer/autumn --- Tell me more about this season.
3. eat --- Tell me more about food.

Responses are prioritized by the order in which the if statements in getResponse() appear.
Responses with keywords in them that are not keywords (e.g. "no" in "know", "mother" in "smothered") are problematic because they would give the wrong response.
    I know all the state capitals. -> Why so negative?
    I like vegetables smothered in cheese. -> Tell me more about your family.
*/

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
	if (statement.trim().length() == 0)
	    {
		response = "Say something, please.";
	    }
	else if (statement.indexOf("no") >= 0)
	    {
		response = "Why so negative?";
	    }
	else if (statement.indexOf("mother") >= 0
		 || statement.indexOf("father") >= 0
		 || statement.indexOf("sister") >= 0
		 || statement.indexOf("brother") >= 0)
	    {
		response = "Tell me more about your family.";
	    }
	else if (statement.indexOf("cat") >= 0
		 || statement.indexOf("dog") >= 0)
	    {
		response = "Tell me more about your pets.";
	    }
	else if (statement.indexOf("Mr.") >= 0
		 || statement.indexOf("Sr.") >= 0)
	    {
		response = "He sounds like a good teacher.";
	    }
	else if (statement.indexOf("Ms.") >= 0
		 || statement.indexOf("Mrs.") >= 0
		 || statement.indexOf("Sra.") >= 0)
	    {
		response = "She sounds like a good teacher.";
	    }
	else if (statement.indexOf("like") >= 0)
	    {
		response = "Tell me more about your interests.";
	    }
	else if (statement.indexOf("winter") >= 0
		 || statement.indexOf("spring") >= 0
		 || statement.indexOf("summer") >= 0
		 || statement.indexOf("autumn") >= 0)
	    {
		response = "Tell me more about this season.";
	    }
	else if (statement.indexOf("eat") >= 0)
	    {
		response = "Tell me more about food.";
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
		
	if (whichResponse == 0)
	    {
		response = "Interesting, tell me more.";
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
	else if (whichResponse == 4)
	    {
		response = "Really?";
	    }
	else if (whichResponse == 5)
	    {
		response = "Cool.";
	    }

	return response;
    }
}
