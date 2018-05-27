/**
 * ValueException
 * Exception class for GradeBook which catches whether or not there are any grades to averave or min/max
 * If no grades are entered, prompts the user to store grades.
 * @author (Travis Gautier) 
 * @version (15 April 2015)
 */
public class ValueException extends Exception
{
    //Constructor which provides the exception message
    public ValueException()
    {    
        super("There are no grades stored. Please store some grades first.");        
    }
    
    public ValueException(String message)
    {
        super(message);
    }
}
