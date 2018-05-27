/**
 * PlayerException
 * Exception class for Hangman2Demo which catches any number other than 1 or 2 for player amount 
 * @author (Travis Gautier) 
 * @version (15 April 2015)
 */
public class PlayerException extends Exception
{
    //Constructor which provides the exception message
    public PlayerException()
    {    
        super("This is only a one or two player game. Please enter 1 or two for the players.\n");        
    }
    
    public PlayerException(String message)
    {
        super(message);
    }
}