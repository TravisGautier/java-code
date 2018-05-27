
/**
 * Class Student
 * A class which carries the student-id number of person enrolled.
 * @author (Travis Gautier) 
 * @version (14 April 2014)
 */
public class Student extends Person
{
    // create variables
    private int studentNumber;      //stores the student's id number
    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        //initialize instance variables
        super();    //inherits the Person class
        studentNumber = 0;
    }
    //method which handles the first student id of an instance of Student
    public Student(String initialName, int initialStudentNumber)
    {
        super(initialName);    //inherits the Person(initialName) method 
        studentNumber = initialStudentNumber;   //load the initial student id
    }
    //method which changes the student id of a person from the initial id
    public void reset(String newName, int newStudentNumber)
    {
        setName(newName);   //inherits the setName(newName) method
        studentNumber = newStudentNumber;   
    }
    //accessor method which returns the value of integer 'studentNumber'
    public int getStudentNumber()
    {
        return studentNumber;
    }
    //mutator method to change value of student id
    public void setStudenNumber(int newStudentNumber)
    {
        studentNumber = newStudentNumber;
    }
    //method which declares what the program user will see
    public void writeOutput()
    {
        System.out.println("Name: " + getName());
        System.out.println("Student Number: " + studentNumber);
    }
}
