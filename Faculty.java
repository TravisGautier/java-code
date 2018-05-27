
/**
 * Class Faculty
 * A class which carries the job title of a specific Employee
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Faculty extends Employee
{
    // create variables
    private String title;  

    /**
     * Constructor for objects of class Undergraduate
     */
    public Faculty()
    {
        super();    //inherits the Employee class
        title = "No title yet.";    //initialize string variable
    }
    //method which handles the first title of a Faculty Employee
    public Faculty(String initialName, int initialIdentityNumber, String initialTitle)
    {
        super(initialName, initialIdentityNumber);  //inherits name and employee id
        setTitle(initialTitle);     //load the initial Faculty title
    }
    //method which changes the Faculty title of a person from the initial title
    public void reset(String newName, int newIdentityNumber, String newTitle)
    {
        reset(newName, newIdentityNumber); //Student's reset
        setTitle(newTitle);
    }
    //accessor method which returns the value of string 'title'
    public String getTitle()
    {
        return title;
    }
    //mutator method to change value of Faculty title
    public void setTitle(String newTitle)
    {
        title = newTitle;
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        super.writeOutput();
        System.out.println("Faculty Title: " + title);
    }
}
