
/**
 * Class Person
 * The main class which handles all the base-line information about any given person.
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Person
{
    // create variables
    private String name;    //stores person's name
    /**
     * Constructor for objects of class Person
     */
    public Person()
    {
        // initialise instance variables
        name = "No name yet";
    }
    //Method which handles the first name of a single instance
    public Person(String initialName)
    {
        name = initialName;     //load the initial name as the name of the person
    }
    //Methods which changes the name of a person from the initial name
    public void setName(String newName)
    {
        name = newName;
    }
    //Accessor method which returns the value of the string 'name'
    public String getName()
    {
        return name;        //current name of person
    }
    //Method which declares what the program user will see
    public void writeOutput()
    {
        System.out.println("Name: " + name);    //Display the name of the person
    }
}
