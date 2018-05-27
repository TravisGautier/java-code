
/**
 * Class Employee
 * A class which carries the employee identification number of a person working.
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Employee extends Person
{
    // create variables
    private int identityNumber; //stores the employee's identification number

    /**
     * Constructor for objects of class Employee
     */
    public Employee()
    {
        super();    //inherits the Person class
        identityNumber = 0; //initialize integer variable
    }
    //method which handles the first employee id of an instance of Employee
    public Employee(String initialName, int initialIdentityNumber)
    {
        super(initialName);  //inherits the Person(initialName) method 
        identityNumber = initialIdentityNumber; //load the initial employee id
    }
    //method which changes the employee id of a person from the initial id
    public void reset(String newName, int newIdentityNumber)
    {
        setName(newName);   //inherits the setName(newName) method
        identityNumber = newIdentityNumber;
    }
    //accessor method which returns the value of integer 'identityNumber'
    public int getIdentityNumber()
    {
        return identityNumber;
    }
    //mutator method to change value of employee id
    public void setIdentityNumber(int newIdentityNumber)
    {
        identityNumber = newIdentityNumber;
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("ID Number: " + identityNumber);
    }
}
