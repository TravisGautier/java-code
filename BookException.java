/**
 * BookException
 * Exception class for GradeBook which catches any input on the gradebook menu other than 1 through 5
 * @author (Travis Gautier) 
 * @version (15 April 2015)
 */
public class BookException extends Exception
{
    //Constructor which provides the exception message
    public BookException()
    {    
        super("Please enter a number between 1 and 5.");        
    }
    
    public BookException(String message)
    {
        super(message);
    }
}
