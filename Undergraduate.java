
/**
 * Class Undergraduate
 * A class which carries the academic level of an Undergraduate Student
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Undergraduate extends Student
{
    // create variables
    private int level;  //1 for freshman, 2 for sophomore, 3 for junior, 4 for senior.
    /**
     * Constructor for objects of class Undergraduate
     */
    public Undergraduate()
    {
        //initialize instance variables
        super();    //inherits the Student class
        level = 1;  //initial level is freshman
    }
    //method which brings in the name of the Person and the id number of the Student
    //determines initial level
    public Undergraduate(String initialName, int initialStudentNumber, int initialLevel)
    {
        super(initialName, initialStudentNumber);
        setLevel(initialLevel); //checks 1 <= newLevel <= 4
    }
    //method which resets the variable values in order to handle new input
    public void reset(String newName, int newStudentNumber, int newLevel)
    {
        reset(newName, newStudentNumber); //Student's reset
        setLevel(newLevel); //checks 1 <= newLevel <= 4
    }
    //accessor method which returns the value of integer 'level'
    public int getLevet()
    {
        return level;
    }
    //mutator method for changing the Undergraduate level
    public void setLevel(int newLevel)
    {
        if ((1 <= newLevel) && (newLevel <= 4)) //determines the level input is correct
            level = newLevel;
        else    //the level input is not between 1 and 4
        {
            System.out.println("Illegal level!");
            System.exit(0);
        }
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("StudentLevel: " + level);
    }
}
