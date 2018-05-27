
public class NegativeNumberException extends Exception
{
    public NegativeNumberException()
    {
        super("Enter a negative number");
    }
    public NegativeNumberException(String message)
    {
        super(message);
    }
}