/**
 * GradeException
 * Exception class for GradeBook which catches any negative input in the gradebook array 
 * @author (Travis Gautier) 
 * @version (15 April 2015)
 */
public class GradeException extends Exception
{
    //Constructor which provides the exception message
    public GradeException()
    {    
        super("Invalid grade: Grade was negative.\n");        
    }
    
    public GradeException(String message)
    {
        super(message);
    }
}