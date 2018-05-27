/**
 * NameException
 * Exception class for Hangman2Demo which catches a null value for a name, or too long of a name
 * @author (Travis Gautier) 
 * @version (15 April 2015)
 */
public class NameException extends Exception
{
    //Constructor which provides the exception message
    public NameException()
    {    
        super("Please enter a valid name. If you have a long name, consider using a nickname.\n");        
    }
    
    public NameException(String message)
    {
        super(message);
    }
}