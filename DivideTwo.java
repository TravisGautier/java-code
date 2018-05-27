import java.util.*;
/**
 * Class DivideTwo
 * Program which is an example of catching wrong input through exceptions.
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */

public class DivideTwo
{
    public static void main(String[] args)
    {
        //New scanner input
        Scanner keyboard = new Scanner(System.in);
        
        try //Catches numerator and denominator exceptions
        {
            System.out.print("Enter the numerator: ");
            int numerator = keyboard.nextInt(); //User enters the numerator
            if (numerator < 0)
                throw new NegativeNumberException("Your number was negative.");
            System.out.print("Enter the denominator: ");
            int denominator = keyboard.nextInt();   //User enters the denominator
            if (denominator < 0)
                throw new NegativeNumberException("Your denominator is negative");
            if (denominator == 0)
                throw new Exception("Cannot divide by zero!");
            else    //Divides the two numbers
                System.out.println(numerator + "/" + denominator + "=" + numerator/denominator);
        }

        catch (Exception e) //User entered negative numbers or zero in the denominator
        {
            System.out.println(e.getMessage());
        }
    }
}