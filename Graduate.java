
/**
 * Class Graduate
 * A class which carries the Student's degree major
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Graduate extends Student
{
    // create variables
    private String degree;  //holds degree major
    /**
     * Constructor for objects of class Undergraduate
     */
    public Graduate()
    {
        //initialize instance variables
        super();    //inherits the Student class
        degree = "No degree yet.";
    }
    //method which brings in the name of the Person and the id number of the Student
    //determines initial degree major
    public Graduate(String initialName, int initialStudentNumber, String initialDegree)
    {
        super(initialName, initialStudentNumber);
        setDegree(initialDegree); 
    }
    //method which resets the variable values in order to handle new input
    public void reset(String newName, int newStudentNumber, String newDegree)
    {
        reset(newName, newStudentNumber); //Student's reset
        setDegree(newDegree);
    }
    //accessor method which returns the value of integer 'degree'
    public String getDegree()
    {
        return degree;
    }
    //mutator method for changing the degree major
    public void setDegree(String newDegree)
    {
        degree = newDegree;         
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Bachelor's Degree: " + degree);
    }
}
