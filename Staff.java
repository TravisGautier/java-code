
/**
 * Class Staff
 * A class which carries the pay grade of a specific employee
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Staff extends Employee
{
    // create variables
    private int payGrade;  //Between 1 and 20

    /**
     * Constructor for objects of class Undergraduate
     */
    public Staff()
    {
        super();    //inherits the Employee class
        payGrade = 1;   //sets pay grade at 1
    }
    //method which handles the initial pay grade of a Faculty Employee
    public Staff(String initialName, int initialIdentityNumber, int initialPayGrade)
    {
        super(initialName, initialIdentityNumber);  //inherits name and employee id
        setPayGrade(initialPayGrade); //checks 1 <= newLevel <= 20
    }
    //method which changes the Staff pay grade of a person from the initial pay grade
    public void reset(String newName, int newIdentityNumber, int newPayGrade)
    {
        reset(newName, newIdentityNumber); //Student's reset
        setPayGrade(newPayGrade); //checks 1 <= newLevel <= 20
    }
    //accessor method which returns the value of string 'payGrade'
    public int getPayGrade()
    {
        return payGrade;
    }
    //mutator method to change value of Faculty title
    public void setPayGrade(int newPayGrade)
    {
        if ((1 <= newPayGrade) && (newPayGrade <= 20)) //determines the payGrade input is correct
            payGrade = newPayGrade;
        else    //the payGrade input is not between 1 and 20
        {
            System.out.println("Incorrect pay grade!");
            System.exit(0);
        }
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Pay Grade: " + payGrade);
    }
}
